package coffeeshop.coffeeshop.services;

import coffeeshop.coffeeshop.models.entities.Category;
import coffeeshop.coffeeshop.models.entities.CategoryName;

public interface CategoryService {

    public void initCategory();

    Category findByName(CategoryName categoryName);
}
