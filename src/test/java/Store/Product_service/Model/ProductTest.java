package Store.Product_service.Model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class ProductTest {

    @Test
    public void testproduct(){

        Product product= new Product();

        BigDecimal bigDecimal= new BigDecimal(99.7);
        Product product1 = new Product("Something","Someone",bigDecimal);

        product.setName("SomeThing");
        product.setDescription("Sonething");
        product.setPrice(bigDecimal);
        product.setId(1L);

        assertEquals("SomeThing",product.getName());
        assertEquals("Sonething",product.getDescription());
        assertEquals(bigDecimal,product.getPrice());
        assertEquals(1L,product.getId());
    }


}