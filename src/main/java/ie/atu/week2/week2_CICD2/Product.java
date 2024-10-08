package ie.atu.week2.week2_CICD2;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Valid
    @Min(value = 0, message = "id is mandatory")
    @NotNull(message = "id should not left blank")
    private Long id;

    @NotBlank(message = "name should not be left blank")
    @NotNull(message = "Name is mandatory")
    private String name;

    @Min(value = 0, message = "Price should start at 0")
    @NotNull(message = "Nothing is free. Give a price!")

    private Double price;
}
