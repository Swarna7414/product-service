package Store.Product_service.DTO;

import java.math.BigDecimal;

public class ProductResponse {
    private Long id;
    private String name;
    private String Description;
    private BigDecimal price;

    public ProductResponse() {
    }

    public ProductResponse(Long id, String name, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        Description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
