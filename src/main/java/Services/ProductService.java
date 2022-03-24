package Services;

import Models.Product;

import java.util.List;

public interface ProductService {

    public Product createProduct(Product product);

    public List<Product> getAllProduct();
}
