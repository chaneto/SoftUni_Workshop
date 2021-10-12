package coffeeshop.coffeeshop.repositories;

import coffeeshop.coffeeshop.models.entities.Category;
import coffeeshop.coffeeshop.models.entities.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(CategoryName categoryName);
}
