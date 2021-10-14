package coffeeshop.coffeeshop.models.binding;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserLoginBindingModel {

    private Long id;

    @Size(min = 5, max = 20, message = "Username length must be between 5 and 20 characters!")
    @NotBlank(message = "Username cannot be empty string!")
    private String username;

    @Size(min = 3, message = "Password length must be minimum  3 characters!")
    @NotBlank(message = "Password cannot be empty string!")
    private String password;

    public UserLoginBindingModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
