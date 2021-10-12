package example.shopinglist.init;

import example.shopinglist.services.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataIntializer implements CommandLineRunner {

    private final CategoryService categoryService;

    public DataIntializer(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.categoryService.addCategories();
    }
}
