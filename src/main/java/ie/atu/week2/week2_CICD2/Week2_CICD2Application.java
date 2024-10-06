package ie.atu.week2.week2_CICD2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class Week2_CICD2Application {

    public static void main(String[] args) {
        SpringApplication.run(Week2_CICD2Application.class, args);
    }

}
