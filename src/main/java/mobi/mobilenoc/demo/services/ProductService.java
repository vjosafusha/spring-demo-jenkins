package mobi.mobilenoc.demo.services;

import mobi.mobilenoc.demo.entities.Product;
import mobi.mobilenoc.demo.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;
    
    
    public List<Product> listAllProducts(){
        return productRepository.findAll();
    }
    
    public Product createProduct(Product product){
        return productRepository.save(product);
    }
}
