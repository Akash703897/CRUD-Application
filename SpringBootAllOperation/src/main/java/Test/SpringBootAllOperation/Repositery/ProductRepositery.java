package Test.SpringBootAllOperation.Repositery;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Test.SpringBootAllOperation.Entity.product;




@Repository

public interface ProductRepositery extends JpaRepository<product, Integer> {

}
