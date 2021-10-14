package example.shopinglist.services;

import example.shopinglist.model.entities.Category;
import example.shopinglist.model.enums.CategoryNameEnum;

public interface CategoryService {

    public void addCategories();

    Category findByName(CategoryNameEnum name);
}
