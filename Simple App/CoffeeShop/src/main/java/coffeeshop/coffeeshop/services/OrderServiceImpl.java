package coffeeshop.coffeeshop.services;

import coffeeshop.coffeeshop.models.binding.UserLoginBindingModel;
import coffeeshop.coffeeshop.models.entities.Category;
import coffeeshop.coffeeshop.models.entities.CategoryName;
import coffeeshop.coffeeshop.models.entities.Order;
import coffeeshop.coffeeshop.models.entities.User;
import coffeeshop.coffeeshop.models.services.OrderServiceModel;
import coffeeshop.coffeeshop.repositories.OrderRepository;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final HttpSession httpSession;
    private final ModelMapper mapper;
    private final CategoryService categoryService;
    private final UserService userService;

    public OrderServiceImpl(OrderRepository orderRepository, HttpSession httpSession, ModelMapper mapper, CategoryService categoryService, UserService userService) {
        this.orderRepository = orderRepository;
        this.httpSession = httpSession;
        this.mapper = mapper;
        this.categoryService = categoryService;
        this.userService = userService;
    }

    @Override
    public void addOrder(OrderServiceModel orderServiceModel) {
        Order order = this.mapper.map(orderServiceModel, Order.class);
        Category category = this.categoryService.findByName(orderServiceModel.getCategory());
        UserLoginBindingModel userLoginBindingModel = (UserLoginBindingModel) httpSession.getAttribute("user");
        User employee = this.userService.findByUsernameAndPassword(userLoginBindingModel.getUsername(), userLoginBindingModel.getPassword());
        order.setCategory(category);
        order.setEmployee(employee);
        this.orderRepository.save(order);

    }

    @Override
    public List<Order> findAllByCategory_NameOrderByPriceDesc(CategoryName categoryName) {
        return this.orderRepository.findAllByCategory_NameOrderByPriceDesc(categoryName);
    }

    @Override
    public BigDecimal getAllTimeSum() {
        return this.orderRepository.getAllTimeSum();
    }

    @Override
    public void readyProduct(Long id) {
        this.orderRepository.deleteById(id);
    }

    @Override
    public int getAllUserOrders(String username) {
        return this.orderRepository.getAllUserOrders(username);
    }

    @Override
    public List<String> getAllUsers() {
        return this.orderRepository.getAllUsers();
    }
}
