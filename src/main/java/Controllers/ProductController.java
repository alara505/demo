package Controllers;

import Models.Product;
import Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Product>> getAllProduct(){
        return new ResponseEntity<List<Product>>(productService.getAllProduct(), HttpStatus.OK); //Status code is 200.
    }

//    @PostMapping(value = "add", consumes = "application/json")
//    public ResponseEntity<Product> createProduct(@RequestBody Product product){
//        return new ResponseEntity<Product>(productService.createProduct(product), HttpStatus.CREATED); // 201
//    }
    @PostMapping(value = "add", consumes = "application/json")
    public ResponseEntity<List<Product>> createProduct(@RequestBody HttpEntity<String> yes){
        System.out.println(yes);
        return new ResponseEntity<List<Product>>(productService.getAllProduct(), HttpStatus.CREATED); // 201
    }
}
