package coffeeshop.coffeeshop.web;

import coffeeshop.coffeeshop.models.entities.CategoryName;
import coffeeshop.coffeeshop.services.OrderService;
import coffeeshop.coffeeshop.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    private final OrderService orderService;
    private final UserService userService;

    public HomeController(OrderService orderService, UserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model){
        if(httpSession.getAttribute("user") == null){
        return "index";
        }

        BigDecimal allSUm = this.orderService.getAllTimeSum();
        model.addAttribute("allSUm", allSUm);
        model.addAttribute("coffees", orderService.findAllByCategory_NameOrderByPriceDesc(CategoryName.COFFEE));
        model.addAttribute("cakes", orderService.findAllByCategory_NameOrderByPriceDesc(CategoryName.CAKE));
        model.addAttribute("drinks", orderService.findAllByCategory_NameOrderByPriceDesc(CategoryName.DRINK));
        model.addAttribute("others", orderService.findAllByCategory_NameOrderByPriceDesc(CategoryName.OTHER));
        List<String> usernames = this.orderService.getAllUsers();
        Map<String, Integer> users = new LinkedHashMap<>();
        for(String out : usernames){
            users.put(out, this.orderService.getAllUserOrders(out));
        }
        model.addAttribute("users", users);

        return "home";
    }

}
