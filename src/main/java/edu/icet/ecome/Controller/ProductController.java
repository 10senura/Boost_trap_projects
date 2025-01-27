package edu.icet.ecome.Controller;

import edu.icet.ecome.model.Product;
import edu.icet.ecome.scrvice.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class ProductController {

    final ProductService service;

    @GetMapping("/filter-product/{vendor}/{category}")
    List<Product> filterproductbyvendor(
            @PathVariable String vendor,
            @PathVariable String category
    ){
            log.info("Request Received for filter-Product|Vendor- {}| Category-{}|",vendor,category);
        return null;
    }

    @GetMapping("/filter-product")
    List<Product> filterproductbyvendorv2(
            @RequestParam(value = "vendor") String vendor,
            @RequestParam(value = "category") String category
    ){
        System.out.println(vendor);
        System.out.println(category);
       return null;
    }
}

