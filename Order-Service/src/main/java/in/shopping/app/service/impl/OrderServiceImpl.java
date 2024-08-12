package in.shopping.app.service.impl;

import org.springframework.stereotype.Service;
import in.shopping.app.client.InventoryClient;
import in.shopping.app.dto.OrderRequest;
import in.shopping.app.entity.Order;
import in.shopping.app.repository.OrderRespository;
import in.shopping.app.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {
	
	private final OrderRespository orderRespository;
	private final InventoryClient inventoryClient;
	
	@Override
	public Order placeOrder(OrderRequest orderRequest) {
		
		var isProductInStock = inventoryClient.isInStock(orderRequest.skuCode(), 
				orderRequest.quantity());
		if(isProductInStock) {
		Order order = Order.builder()
				.orderNumber(orderRequest.orderNumber())
				.price(orderRequest.price())
				.quantity(orderRequest.quantity())
				.skuCode(orderRequest.skuCode())
				.build();
		return orderRespository.save(order);
		} else {
			//TODO : handle custom exception
			return null;
		}
	}

}
