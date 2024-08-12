package in.app.shopping.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.app.shopping.dto.ProductRequest;
import in.app.shopping.dto.ProductResponse;
//import in.app.shopping.dto.ProductResponse;
import in.app.shopping.entity.Product;
import in.app.shopping.repository.ProductRepository;
import in.app.shopping.service.ProductService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	
	@Override
	public Product createProduct(ProductRequest productRequest) {
		Product product=Product.builder()
				.name(productRequest.name())
				.description(productRequest.description())
				.price(productRequest.price())
				.build();
		return productRepository.save(product);
	}

	@Override
	public List<ProductResponse> getAllProducts() {
				return productRepository.findAll().stream()
				.map(product -> 
				new ProductResponse(product.getId(), product.getName(), 
						product.getDescription(), product.getPrice()))
				.toList();
	}

}
