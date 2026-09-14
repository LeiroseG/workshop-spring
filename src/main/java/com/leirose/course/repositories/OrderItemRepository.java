package com.leirose.course.repositories;

import com.leirose.course.entities.OrderItem;
import com.leirose.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
