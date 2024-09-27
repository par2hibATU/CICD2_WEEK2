package ie.atu.week2.week2_CICD2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Product updateProduct(int id, String name, double price){
        Optional<Product> existingProductOpt = productList.stream().filter(p -> p.getId() == (id)).findFirst();
        existingProductOpt.ifPresent(p -> p.setName(name));
        existingProductOpt.ifPresent(p -> p.setPrice(price));
        /*if(existingProductOpt.isPresent()){
            Product existingProduct = existingProductOpt.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            return existingProduct;
        }else {
            return null;
        }*/
        return existingProductOpt.get();
    }

}
