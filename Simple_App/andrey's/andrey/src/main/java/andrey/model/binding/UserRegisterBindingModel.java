package andrey.model.binding;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {

    @NotBlank(message = "Username cannot empty string!!!")
    @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters!")
    private String username;

    @NotBlank(message = "Password cannot empty string!!!")
    @Size(min = 5, max = 20, message = "Password must be between 5 and 20 characters!")
    private String password;

    @NotBlank(message = "Password cannot empty string!!!")
    @Size(min = 5, max = 20, message = "Password must be between 5 and 20 characters!")
    private String confirmPassword;

    @NotNull(message = "Email cannot be null!!!")
    @Email(regexp = "^(\\w+@\\w+)(.\\w+){2,}$", message = "Please enter valid email!!!")
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
