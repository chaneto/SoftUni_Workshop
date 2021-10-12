package coffeeshop.coffeeshop.models.binding;

import coffeeshop.coffeeshop.models.entities.CategoryName;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderAddBindingModel {

    @Size(min = 3, max = 20, message = "Name length must be between 3 and 20 characters!")
    @NotBlank(message = "Username cannot be empty string!")
    private String name;

    @DecimalMin(value = "0", message = "Price must be positive!")
    @NotNull(message = "Price cannot is a null!")
    private BigDecimal price;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @PastOrPresent(message = "The date cannot be in the future!")
    private LocalDateTime orderTime;

    @Size(min = 5, message = "Username length must be minimum 5 characters!")
    @NotBlank(message = "Description cannot be empty string!")
    private String description;

    @NotNull(message = "You must select the category!")
    private CategoryName category;

    public OrderAddBindingModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryName getCategory() {
        return category;
    }

    public void setCategory(CategoryName category) {
        this.category = category;
    }
}
