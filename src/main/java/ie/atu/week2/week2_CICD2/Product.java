package ie.atu.week2.week2_CICD2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    public long id;
    public String name;
    public double price;
}
