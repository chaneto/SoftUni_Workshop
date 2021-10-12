package example.shopinglist.services;


import example.shopinglist.model.entities.Product;
import example.shopinglist.model.enums.CategoryNameEnum;
import example.shopinglist.model.services.ProductServiceModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    ProductServiceModel findByName(String name);

    void addProduct(ProductServiceModel productServiceModel);

    List<Product> findByCategory_Name(CategoryNameEnum categoryNameEnum);

    List<Product> getAllProduct();

    BigDecimal getAllSUm();

    void byAll();

    void buyById(Long id);
}
