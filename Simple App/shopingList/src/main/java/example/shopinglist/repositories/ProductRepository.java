package example.shopinglist.repositories;

import example.shopinglist.model.entities.Product;
import example.shopinglist.model.enums.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);

    List<Product> findByCategory_Name(CategoryNameEnum categoryNameEnum);

    @Query("select p from Product as p order by p.price")
    List<Product> getAllProduct();

    @Query("select sum(p.price) from Product as p")
    BigDecimal getAllSUm();
}
