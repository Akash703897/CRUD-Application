package Test.SpringBootAllOperation.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Test.SpringBootAllOperation.Entity.product;
import Test.SpringBootAllOperation.Repositery.ProductRepositery;
import Test.SpringBootAllOperation.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService  {
	
	
	@Autowired  
	  private ProductRepositery productRepositery;
	 
	  @Override
	   public  product saveproduct(product product) {
		   product product1 = this.productRepositery.save(product);
		   return product1;
		   
	   }
	   
	  @Override
	  public List<product> getAllproduct() {
		  List<product> products = this.productRepositery.findAll();
		  return products;
	  }
	 
	  @Override
	public product getproductById(int id) {
		product product = this.productRepositery.findById(id).get();
	     return product;
	  
		
	}
	@Override
	public void deleteProductById(int id) {
	    product  product = this.productRepositery.findById(id).get();

	    if (product != null) {
	    	productRepositery.deleteById(id);
	    } else {
	    	 System.out.println("Id Not Found");
	    }
	}
	@Override
	public product updateproduct(product product,int id) {
		product product1 = this.productRepositery.findById(id).get();
		
		product1.setColour(product.getColour());
		product1.setName(product.getName());
		product1.setShape(product.getShape());
		
		product product2 = this.productRepositery.save(product1);
		return product2;
		
	}


	  
   
}
