package example.shopinglist.model.binding;

import example.shopinglist.model.entities.Category;
import example.shopinglist.model.enums.CategoryNameEnum;
import org.hibernate.hql.internal.ast.util.NodeTraverser;
import org.hibernate.validator.constraints.Normalized;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductAddBindingModel {

    @NotBlank(message = "Name cannot be empty string!!!")
    @Size(min = 3, max = 20, message = "Name length must be between 3 and 20 characters!")
    private String name;

    @Size(min = 5, message = "Description min length must be minimum 5 characters!")
    @NotBlank(message = "Description cannot be empty string!!!")
    private String description;

    @NotNull(message = "Price cannot be null!!!")
    @DecimalMin(value = "1", message = "Price must be a positive number!")
    private BigDecimal price;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @NotNull(message = "Date cannot be null!!!")
    @FutureOrPresent(message = "The date cannot be in the past!")
    private LocalDateTime neededBefore;

    @NotNull(message = "Category cannot be null!!!")
    private CategoryNameEnum category;

    public ProductAddBindingModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getNeededBefore() {
        return neededBefore;
    }

    public void setNeededBefore(LocalDateTime neededBefore) {
        this.neededBefore = neededBefore;
    }

    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }
}
