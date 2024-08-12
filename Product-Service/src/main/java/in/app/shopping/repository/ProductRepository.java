package in.app.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import in.app.shopping.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
