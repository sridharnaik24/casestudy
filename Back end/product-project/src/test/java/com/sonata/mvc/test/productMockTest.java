package com.sonata.mvc.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;



import com.sonata.mvc.controller.ProductController;
import com.sonata.mvc.model.Product;
import com.sonata.mvc.repository.ProductRepository;



@SpringBootTest
class ProductMockTest {



   @Autowired
    ProductController pcon;
    
    @MockBean
    ProductRepository prepo;
     
    @Test
    public void getCat() {
        when(prepo.findAll()).thenReturn((List<Product>) Stream.of(new Product(10L,"samsung","Galaxy m7 mobile","Mobile",50000.0,"blue","white",1),new Product(2,"Apple","Mobile","descrption",50000.0,"blue","img",1)).collect(Collectors.toList()));
        assertEquals(2,pcon.getAllProducts().size());
    }
    @Test
    public void saveProducts() {
        Product prod = new Product(10L,"samsung","Galaxy m7 mobile","Mobile",50000.0,"blue","white",1);
        when(prepo.save(prod)).thenReturn(prod);
        assertEquals(prod, pcon.saveProduct(prod));
    }
   @Test
    public void deleteProducts() {
        Product prod = new Product(10L,"samsung","Galaxy m7 mobile","Mobile",50000.0,"blue","white",1);
        pcon.deleteProducts(prod);
        verify(prepo, times(1)).delete(prod);
        
    }
}