package ie.atu.week2.week2_CICD2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private List<Product> productList = new ArrayList<>();

    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        productList.add(product);
        return product;
    }

}


