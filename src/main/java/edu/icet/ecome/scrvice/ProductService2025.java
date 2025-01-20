package edu.icet.ecome.scrvice;

import edu.icet.ecome.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService2025 implements ProductService{

     public List<Product> getProduct(){

        Product product = new Product();
        product.setPrice(200.0);
        Product prd2 = new Product("bun","abc",123.0);

        Product prd3 = Product.builder()
                .name("Apple")
                .vendor("ABC")
                .price(300.0).build();

        return Arrays.asList(prd2);
    }
}
