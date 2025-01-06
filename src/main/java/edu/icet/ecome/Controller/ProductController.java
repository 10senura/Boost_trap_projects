package edu.icet.ecome.Controller;

import edu.icet.ecome.model.Product;
import edu.icet.ecome.scrvice.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/get-product")

      List<Product> getProduct(){
        ProductService Service= new ProductService();
        List<Product> products = Service.getProduct();
        return products;
    }
}
