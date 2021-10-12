package andrey.web;

import andrey.model.binding.ProductAddBindingModel;
import andrey.model.services.ProductServiceModel;
import andrey.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductContrtoller {

    private final ProductService productService;
    private final ModelMapper mapper;

    public ProductContrtoller(ProductService productService, ModelMapper mapper) {
        this.productService = productService;
        this.mapper = mapper;
    }

    @GetMapping("/add")
    public String add(Model model){
        if(!model.containsAttribute("productAddBindingModel")){
            model.addAttribute("productAddBindingModel", new ProductAddBindingModel());
        }
        return "add-product";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid ProductAddBindingModel productAddBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("productAddBindingModel", redirectAttributes);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.productAddBindingModel", bindingResult);
            return "redirect:add";
        }
        ProductServiceModel productServiceModel = this.mapper.map(productAddBindingModel, ProductServiceModel.class);
        this.productService.addProduct(productServiceModel);
        return "redirect:/";
    }
}
