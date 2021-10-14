package coffeeshop.coffeeshop.web;

import coffeeshop.coffeeshop.models.binding.OrderAddBindingModel;
import coffeeshop.coffeeshop.models.services.OrderServiceModel;
import coffeeshop.coffeeshop.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final ModelMapper mapper;

    public OrderController(OrderService orderService, ModelMapper mapper) {
        this.orderService = orderService;
        this.mapper = mapper;
    }

    @GetMapping("/add")
    public String addOrder(Model model){
        if(!model.containsAttribute("orderAddBindingModel")){
            model.addAttribute("orderAddBindingModel", new OrderAddBindingModel());
        }
        return "order-add";
    }

    @PostMapping("/add")
    public String addOrderConfirm(@Valid OrderAddBindingModel orderAddBindingModel,
                                  BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("orderAddBindingModel", orderAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.orderAddBindingModel", bindingResult);
            return "redirect:add";
        }

        OrderServiceModel orderServiceModel = this.mapper.map(orderAddBindingModel, OrderServiceModel.class);
        this.orderService.addOrder(orderServiceModel);

        return "redirect:/";
    }

    @GetMapping("/ready/{id}")
    public String ready(@PathVariable Long id){
        this.orderService.readyProduct(id);
        return "redirect:/";
    }

}
