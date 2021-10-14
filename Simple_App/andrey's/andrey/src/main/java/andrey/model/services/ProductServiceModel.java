package andrey.model.services;

import andrey.model.enums.CategoryNameEnum;
import andrey.model.enums.SexEnum;
import java.math.BigDecimal;

public class ProductServiceModel {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private CategoryNameEnum category;
    private SexEnum sex;

    public ProductServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
