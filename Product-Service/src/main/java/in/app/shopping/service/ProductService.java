package in.app.shopping.service;

import java.util.List;
import in.app.shopping.dto.ProductRequest;
import in.app.shopping.dto.ProductResponse;
import in.app.shopping.entity.Product;

public interface ProductService {

	public Product createProduct(ProductRequest productRequest);
	public List<ProductResponse> getAllProducts();
}
