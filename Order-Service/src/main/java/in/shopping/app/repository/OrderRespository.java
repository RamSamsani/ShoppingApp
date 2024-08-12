package in.shopping.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shopping.app.entity.Order;

public interface OrderRespository extends JpaRepository<Order, Long> {

}
