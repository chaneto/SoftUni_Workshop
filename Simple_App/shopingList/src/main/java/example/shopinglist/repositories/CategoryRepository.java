package example.shopinglist.repositories;

import example.shopinglist.model.entities.Category;
import example.shopinglist.model.enums.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(CategoryNameEnum name);
}
