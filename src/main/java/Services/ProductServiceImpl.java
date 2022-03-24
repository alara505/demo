package Services;

import Models.Product;
import Repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;
    @Override
    public Product createProduct(Product product) {
        return productDAO.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productDAO.findAll();
    }
}
