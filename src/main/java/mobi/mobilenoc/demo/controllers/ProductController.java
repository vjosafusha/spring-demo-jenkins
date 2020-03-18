package mobi.mobilenoc.demo.controllers;

import mobi.mobilenoc.demo.entities.Product;
import mobi.mobilenoc.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Controller
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok().body(productService.listAllProducts());
    }
    
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(productService.createProduct(product));
    }
    
}
