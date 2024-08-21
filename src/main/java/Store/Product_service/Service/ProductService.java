package Store.Product_service.Service;

import Store.Product_service.DTO.ProductRequest;
import Store.Product_service.DTO.ProductResponse;
import Store.Product_service.Model.Product;
import Store.Product_service.Repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductService {

    private final Productrepository productrepository;

    @Autowired
    public ProductService(Productrepository productrepository){
        this.productrepository=productrepository;
    }

    public void CreateProduct(ProductRequest productRequest){
        Product product = new Product(productRequest.getName(),productRequest.getDescription(),productRequest.getPrice());

        productrepository.save(product);

    }

    public List<ProductResponse> getallproducts() {
        List<Product> products= productrepository.findAll();

        return products.stream().map(product -> new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        )).collect(Collectors.toList());
    }
}
