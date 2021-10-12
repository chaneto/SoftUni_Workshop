package coffeeshop.coffeeshop.web;

import coffeeshop.coffeeshop.models.binding.UserLoginBindingModel;
import coffeeshop.coffeeshop.models.binding.UserRegisterBindingModel;
import coffeeshop.coffeeshop.models.services.UserServiceModel;
import coffeeshop.coffeeshop.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final ModelMapper mapper;

    public UserController(UserService userService, ModelMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping("/register")
    public String register(Model model){
        if(!model.containsAttribute("userRegisterBindingModel")){
            model.addAttribute("userRegisterBindingModel", new UserRegisterBindingModel());
            model.addAttribute("passwordNotMatch", false);
            model.addAttribute("userIsExists", false);
        }
        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(@Valid UserRegisterBindingModel userRegisterBindingModel,
                                  BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterBindingModel", bindingResult);
            return "redirect:register";
        }

        if(!userRegisterBindingModel.getPassword().equals(userRegisterBindingModel.getCnnfirmPassword())){
            redirectAttributes.addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel);
            redirectAttributes.addFlashAttribute("passwordNotMatch", true);
            return "redirect:register";
        }
        if(this.userService.findByUsernameAndEmail(userRegisterBindingModel.getUsername(),
                userRegisterBindingModel.getEmail()) != null){
            redirectAttributes.addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel);
            redirectAttributes.addFlashAttribute("userIsExists", true);
            return "redirect:register";
        }
        UserServiceModel userServiceModel = this.mapper.map(userRegisterBindingModel, UserServiceModel.class);
        this.userService.register(userServiceModel);
        return "redirect:/";

    }

    @GetMapping("/login")
    public String login(Model model){
        if(!model.containsAttribute("userLoginBindingModel")){
            model.addAttribute("userLoginBindingModel", new UserLoginBindingModel());
            model.addAttribute("userIsNotExists", false);
        }
        return "login";
    }

    @PostMapping("/login")
    public String loginConfirm(@Valid UserLoginBindingModel userLoginBindingModel,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes,
                               HttpSession httpSession){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("userLoginBindingModel", userLoginBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userLoginBindingModel", bindingResult);
            return "redirect:login";
        }

        if(this.userService.findByUsernameAndPassword(userLoginBindingModel.getUsername(),
                userLoginBindingModel.getPassword()) == null){
            redirectAttributes.addFlashAttribute("userLoginBindingModel", userLoginBindingModel);
            redirectAttributes.addFlashAttribute("userIsNotExists", true);
            return "redirect:login";
        }
        httpSession.setAttribute("user", userLoginBindingModel);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }

}
