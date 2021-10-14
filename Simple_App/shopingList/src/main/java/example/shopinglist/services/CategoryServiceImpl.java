package example.shopinglist.services;

import example.shopinglist.model.entities.Category;
import example.shopinglist.model.enums.CategoryNameEnum;
import example.shopinglist.repositories.CategoryRepository;
import example.shopinglist.services.CategoryService;
import org.springframework.stereotype.Service;

import javax.validation.OverridesAttribute;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @Override
    public void addCategories(){
        if(this.categoryRepository.count() == 0){
        for(CategoryNameEnum out : CategoryNameEnum.values()){
            Category category = new Category();
            category.setName(out);
            category.setDescription("Description for: " + out.name());
            this.categoryRepository.save(category);
           }
        }

    }

    @Override
    public Category findByName(CategoryNameEnum name) {
        return this.categoryRepository.findByName(name);
    }
}
