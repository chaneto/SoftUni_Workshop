package example.shopinglist.web;

import example.shopinglist.model.enums.CategoryNameEnum;
import example.shopinglist.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    private final ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model){
        if(httpSession.getAttribute("user") == null){
            return "index";
        }else {
            model.addAttribute("foods", this.productService.findByCategory_Name(CategoryNameEnum.FOOD));
            model.addAttribute("drinks", this.productService.findByCategory_Name(CategoryNameEnum.DRINK));
            model.addAttribute("households", this.productService.findByCategory_Name(CategoryNameEnum.HOUSEHOLD));
            model.addAttribute("others", this.productService.findByCategory_Name(CategoryNameEnum.OTHER));
            model.addAttribute("getAllSum", this.productService.getAllSUm());
            return "home";
        }
    }

    @GetMapping("/buyAll")
    public String buyAll(){
        this.productService.byAll();
        return "home";
    }
}
