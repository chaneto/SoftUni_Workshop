package coffeeshop.coffeeshop.models.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {

    @Size(min = 5, max = 20, message = "Username length must be between 5 and 20 characters!")
    @NotBlank(message = "Username cannot be empty string!")
    private String username;

    private String firstName;

    @Size(min = 5, max = 20, message = "Last name length must be between 5 and 20 characters!")
    @NotBlank(message = "Last name cannot be empty string!")
    private String lastName;

    @Size(min = 3, message = "Password length must be minimum  3 characters!")
    @NotBlank(message = "Password cannot be empty string!")
    private String password;

    @Size(min = 3, message = "Password length must be minimum  3 characters!")
    @NotBlank(message = "Password cannot be empty string!")
    private String cnnfirmPassword;

    @Email(regexp = "^(\\w+@\\w+)(.\\w+){2,}$", message = "Enter Valid email!")
    @NotBlank(message = "Email cannot be empty string!")
    private String email;

    public UserRegisterBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCnnfirmPassword() {
        return cnnfirmPassword;
    }

    public void setCnnfirmPassword(String cnnfirmPassword) {
        this.cnnfirmPassword = cnnfirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
