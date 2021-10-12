package andrey.services;

import andrey.model.entities.Product;
import andrey.model.services.ProductServiceModel;
import andrey.repositorues.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public void addProduct(ProductServiceModel productServiceModel) {
        Product product = this.mapper.map(productServiceModel, Product.class);
        this.productRepository.save(product);
    }
}
