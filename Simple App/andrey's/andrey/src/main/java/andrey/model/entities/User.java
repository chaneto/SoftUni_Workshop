package andrey.model.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters!")
    private String username;

    @Column(nullable = false)
    @Size(min = 5, max = 20, message = "Password must be between 5 and 20 characters!")
    private String password;

    @Column(nullable = false, unique = true)
    @Email(regexp = "^(\\w+@\\w+)(.\\w+){2,}$", message = "Please enter valid email!!!")
    private String email;

    public User() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
