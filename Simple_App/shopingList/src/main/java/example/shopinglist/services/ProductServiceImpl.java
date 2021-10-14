package example.shopinglist.services;

import example.shopinglist.model.entities.Product;
import example.shopinglist.model.enums.CategoryNameEnum;
import example.shopinglist.model.services.ProductServiceModel;
import example.shopinglist.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper mapper;
    private final CategoryService categoryService;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper mapper, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.mapper = mapper;
        this.categoryService = categoryService;
    }

    @Override
    public ProductServiceModel findByName(String name) {
        ProductServiceModel productServiceModel = null;
        if(this.productRepository.findByName(name) != null){
            productServiceModel = this.mapper.map(this.productRepository.findByName(name), ProductServiceModel.class);
        }
        return productServiceModel;
    }

    @Override
    public void addProduct(ProductServiceModel productServiceModel) {
        Product product = this.mapper.map(productServiceModel, Product.class);
        product.setCategory(this.categoryService.findByName(productServiceModel.getCategory()));
        this.productRepository.save(product);
    }

    @Override
    public List<Product> findByCategory_Name(CategoryNameEnum categoryNameEnum) {
        return this.productRepository.findByCategory_Name(categoryNameEnum);
    }

    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.getAllProduct();
    }

    @Override
    public BigDecimal getAllSUm() {
        return this.productRepository.getAllSUm();
    }

    @Override
    public void byAll() {
        this.productRepository.deleteAll();
    }

    @Override
    public void buyById(Long id) {
        this.productRepository.deleteById(id);
    }
}
