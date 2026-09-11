package com.leirose.course.repositories;

import com.leirose.course.entities.Category;
import com.leirose.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
