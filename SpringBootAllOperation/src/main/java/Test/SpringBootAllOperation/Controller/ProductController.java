package Test.SpringBootAllOperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Test.SpringBootAllOperation.Entity.product;
import Test.SpringBootAllOperation.Service.ProductService;

@RestController
@RequestMapping("/product-App")
public class ProductController {

   
	@Autowired
    private ProductService productService;

    @PostMapping
    
    public product saveproduct(@RequestBody product product ) {
    	
    	product product2 = this.productService.saveproduct(product);
		return product2;
    	
    }
    
    @GetMapping
   List<product> getAllproduct(){
	   
	List<product> products = this.productService.getAllproduct();
	return products;
    	
    }
    
   @GetMapping("/{id}")
   public product getProductById(@PathVariable int id) {
       product product = this.productService.getproductById(id);
       
       return product;
   }

    
    
    
   @DeleteMapping("/delete/{id}")
   public String deleteProductById(@PathVariable int id) {
       productService.deleteProductById(id);
       return "Product with ID " + id + " has been deleted successfully.";
   }
   
   @PutMapping("/{id}")
   public String updateproduct(@RequestBody product product, @PathVariable int id) {
	  productService.updateproduct(product ,id);
	
	return "Product with ID " + id + " has been update successfully.";
   }   
}
