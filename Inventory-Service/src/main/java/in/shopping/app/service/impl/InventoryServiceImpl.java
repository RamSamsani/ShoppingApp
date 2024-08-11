package in.shopping.app.service.impl;

import org.springframework.stereotype.Service;

import in.shopping.app.repository.InventoryRepository;
import in.shopping.app.service.InventoryService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService {
	
	private final InventoryRepository inventoryRepository;

	
	@Override
	@Transactional
	public boolean isInStock(String skuCode, Integer quantity) {
		return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
	}

}
