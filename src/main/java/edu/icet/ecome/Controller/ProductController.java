package edu.icet.ecome.Controller;

import edu.icet.ecome.model.Product;
import edu.icet.ecome.scrvice.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    final ProductService service;

    @GetMapping("/get-products")
    List<Product> getProduct() {

        List<Product> products = service.getProduct();
        return products;
    }
}
