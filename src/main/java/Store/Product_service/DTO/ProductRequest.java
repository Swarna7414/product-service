package Store.Product_service.DTO;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;


public class ProductRequest {
    private String name;

    private String Description;

    private BigDecimal price;

    public ProductRequest() {

    }

    public ProductRequest(String name, String description, BigDecimal price) {
        this.name = name;
        Description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
