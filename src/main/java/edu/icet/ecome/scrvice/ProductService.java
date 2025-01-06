package edu.icet.ecome.scrvice;

import edu.icet.ecome.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductService {

     public List<Product> getProduct(){

        Product product = new Product();
        product.setPrice(200.0);
        Product prd2 = new Product("bun","abc",123.0);

        Product prd3 = Product.builder()
                .name("Apple")
                .vendor("ABC")
                .price(300.0).build();

        return Arrays.asList(product,prd2,prd3);
    }
}
