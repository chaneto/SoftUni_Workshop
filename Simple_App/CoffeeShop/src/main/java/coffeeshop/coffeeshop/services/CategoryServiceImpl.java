package coffeeshop.coffeeshop.services;

import coffeeshop.coffeeshop.models.entities.Category;
import coffeeshop.coffeeshop.models.entities.CategoryName;
import coffeeshop.coffeeshop.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void initCategory(){
        if(categoryRepository.count() == 0){
            CategoryName[] categoryNames = CategoryName.values();
            for(CategoryName out : categoryNames){
                Category category = new Category();
                category.setName(out);
                if(out.equals(CategoryName.DRINK)){
                    category.setNeededTime(1);
                }else if(out.equals(CategoryName.COFFEE)){
                    category.setNeededTime(2);
                }else if(out.equals(CategoryName.OTHER)){
                    category.setNeededTime(5);
                }else if(out.equals(CategoryName.CAKE)){
                    category.setNeededTime(10);
                }
                this.categoryRepository.save(category);
            }
        }
    }

    @Override
    public Category findByName(CategoryName categoryName) {
        return this.categoryRepository.findByName(categoryName);
    }
}
