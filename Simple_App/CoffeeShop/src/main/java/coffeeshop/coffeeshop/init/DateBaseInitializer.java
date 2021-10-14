package coffeeshop.coffeeshop.init;

import coffeeshop.coffeeshop.services.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DateBaseInitializer implements CommandLineRunner {

    private final CategoryService categoryService;

    public DateBaseInitializer(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.categoryService.initCategory();
    }
}
