package ie.atu.week2.week2_CICD2;


import jakarta.validation.constraints.Null;
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

    public Product updateProduct(long id, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return product;
            }

        }
        /*if(existingProductOpt.isPresent()){
            Product existingProduct = existingProductOpt.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            return existingProduct;
        }else {
            return null;
        }*/
        return null;
    }
    public Product deleteProduct(long id) {
        for(Product product : productList){
            if(product.getId() == id){
                productList.remove(product);
                return product;
            }
        }
        return null;
    }

}
