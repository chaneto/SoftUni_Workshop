package andrey.model.binding;

import andrey.model.enums.CategoryNameEnum;
import andrey.model.enums.SexEnum;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class ProductAddBindingModel {

    @NotBlank(message = "Name cannot be empty string!!!")
    @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters!")
    private String name;

    @NotBlank(message = "Description cannot be empty string!!!")
    @Size(min = 5, message = "Description must be minimum 5 characters!")
    private String description;

    @DecimalMin(value = "1", message = "Price must be positive!")
    @NotNull(message = "Price cannot be empty string!!!")
    private BigDecimal price;

    @NotNull(message = "Please select category!!!")
    @Enumerated(value = EnumType.STRING)
    private CategoryNameEnum category;

    @NotNull(message = "Please select sex!!!")
    @Enumerated(value = EnumType.STRING)
    private SexEnum sex;

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

    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
