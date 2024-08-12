package in.shopping.app.service;

import in.shopping.app.dto.OrderRequest;
import in.shopping.app.entity.Order;

public interface OrderService {
	public Order placeOrder(OrderRequest orderRequest);
	
}
