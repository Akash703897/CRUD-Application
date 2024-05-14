package Test.SpringBootAllOperation.Service;



import java.util.List;

import org.springframework.stereotype.Service;

import Test.SpringBootAllOperation.Entity.product;




@Service
public  interface ProductService {

	 product saveproduct(product product) ;

	List<product> getAllproduct();

	product getproductById(int Id);

	

	void deleteProductById(int id);

	product updateproduct(product product,int id);
	
}
    	
