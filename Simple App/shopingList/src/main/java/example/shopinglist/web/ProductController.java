package example.shopinglist.web;

import example.shopinglist.model.binding.ProductAddBindingModel;
import example.shopinglist.model.services.ProductServiceModel;
import example.shopinglist.services.CategoryService;
import example.shopinglist.services.ProductService;
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
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final ModelMapper mapper;
    private final CategoryService categoryService;

    public ProductController(ProductService productService, ModelMapper mapper, CategoryService categoryService) {
        this.productService = productService;
        this.mapper = mapper;
        this.categoryService = categoryService;
    }

    @GetMapping("/add")
    public String add(Model model){
        if(!model.containsAttribute("productAddBindingModel")){
            model.addAttribute("productAddBindingModel", new ProductAddBindingModel());
            model.addAttribute("productIsExists", false);
        }
        return "product-add";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid ProductAddBindingModel productAddBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("productAddBindingModel", productAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.productAddBindingModel", bindingResult);
            return "redirect:add";
        }
        if(this.productService.findByName(productAddBindingModel.getName()) != null){
            redirectAttributes.addFlashAttribute("productAddBindingModel", productAddBindingModel);
            redirectAttributes.addFlashAttribute("productIsExists", true);
            return "redirect:add";
        }

        ProductServiceModel productServiceModel = this.mapper.map(productAddBindingModel, ProductServiceModel.class);

        this.productService.addProduct(productServiceModel);

        return "redirect:/";

    }

    @GetMapping("/buy/{id}")
    public String buyById(@PathVariable Long id){
        System.out.println();
        this.productService.buyById(id);
        return "redirect:/";
    }
}
