package andrey.model.entities;

import andrey.model.enums.CategoryNameEnum;
import andrey.model.enums.SexEnum;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters!")
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    @Size(min = 5, message = "Description must be minimum 5 characters!")
    private String description;

    @DecimalMin(value = "1", message = "Price must be positive!")
    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private CategoryNameEnum category;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private SexEnum sex;

    public Product() {
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
