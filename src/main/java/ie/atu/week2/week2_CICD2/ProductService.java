package ie.atu.week2.week2_CICD2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    private List<Product> productList = new ArrayList<>();


    public List<Product> getAllProducts() {
        return productList;
    }


    public Product addProduct( Product product) {
        productList.add(product);
        return product;
    }

}
