package io.microservices.demo.Order.Repository;

import io.microservices.demo.Order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    Optional<Order> findByUserIdAndId(Long userId, Integer orderId);
}
