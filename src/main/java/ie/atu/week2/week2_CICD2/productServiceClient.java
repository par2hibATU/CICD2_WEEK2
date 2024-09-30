package ie.atu.week2.week2_CICD2;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name= "confirm", url = "http://localhost:8081")
public interface productServiceClient {
    @PostMapping("/confirm")
    String details(@RequestBody Product product);


}
