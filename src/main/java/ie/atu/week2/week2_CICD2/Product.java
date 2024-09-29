package ie.atu.week2.week2_CICD2;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Min(value = 0)
    private long id;

    @NotBlank
    private String name;

    @Min(value = 0)
    private double price;
}
