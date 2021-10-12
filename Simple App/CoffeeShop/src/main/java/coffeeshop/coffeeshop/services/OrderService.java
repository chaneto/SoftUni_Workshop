package coffeeshop.coffeeshop.services;

import coffeeshop.coffeeshop.models.entities.CategoryName;
import coffeeshop.coffeeshop.models.entities.Order;
import coffeeshop.coffeeshop.models.services.OrderServiceModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface OrderService {
    void addOrder(OrderServiceModel orderServiceModel);

    List<Order> findAllByCategory_NameOrderByPriceDesc(CategoryName categoryName);

    BigDecimal getAllTimeSum();

    void readyProduct(Long id);

    int getAllUserOrders(String username);

    List<String> getAllUsers();
}
