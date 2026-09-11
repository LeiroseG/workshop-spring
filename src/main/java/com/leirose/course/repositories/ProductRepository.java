package com.leirose.course.repositories;

import com.leirose.course.entities.Category;
import com.leirose.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
