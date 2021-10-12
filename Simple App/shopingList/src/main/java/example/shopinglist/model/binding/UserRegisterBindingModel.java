package example.shopinglist.model.binding;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {

    @NotBlank(message = "Username cannot be empty string!!!")
    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters ")
    private String username;

    @NotBlank(message = "Password cannot be empty string!!!")
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters ")
    private String password;

    @NotBlank(message = "Password cannot be empty string!!!")
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters ")
    private String confirmPassword;

    @Email(regexp = "^(\\w+@\\w+)(.\\w+){2,}$", message = "Please enter valid email!!!")
    @NotBlank(message = "Email cannot be empty string!!!")
    private String email;

    public UserRegisterBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
