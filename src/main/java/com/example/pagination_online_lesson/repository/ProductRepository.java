package com.example.pagination_online_lesson.repository;

import com.example.pagination_online_lesson.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
