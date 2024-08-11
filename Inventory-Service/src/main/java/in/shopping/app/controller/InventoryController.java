package in.shopping.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.shopping.app.service.InventoryService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@AllArgsConstructor
public class InventoryController {

	 private final InventoryService inventoryService;
	 
	    @GetMapping
	    @ResponseStatus(HttpStatus.OK)
	    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
	        return inventoryService.isInStock(skuCode, quantity);
	    }
}
