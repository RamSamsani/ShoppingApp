package in.shopping.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shopping.app.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, int quantity);
}
