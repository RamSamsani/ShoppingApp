package in.shopping.app.service;

public interface InventoryService {
	boolean isInStock(String skuCode, Integer quantity);
}
