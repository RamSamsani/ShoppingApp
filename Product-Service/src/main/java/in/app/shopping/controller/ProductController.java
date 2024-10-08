package in.app.shopping.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.app.shopping.dto.ProductRequest;
import in.app.shopping.dto.ProductResponse;
import in.app.shopping.entity.Product;
import in.app.shopping.service.ProductService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }
 
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

}
