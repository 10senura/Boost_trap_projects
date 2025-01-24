package edu.icet.ecome.scrvice;

import edu.icet.ecome.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService2025 implements ProductService{

     public List<Product> getProduct(){
        Product prd2 = new Product("bun","abc",123.0);
        return Arrays.asList(prd2);
    }
}
