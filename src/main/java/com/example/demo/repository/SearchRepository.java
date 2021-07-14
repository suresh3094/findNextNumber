package com.example.demo.repository;

import com.example.demo.entity.Number;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<Number, Integer> {

    @Query(value = "SELECT * FROM suresh.category_code where category_id=:CategoryId",nativeQuery = true)
    int findByCategoryId(int CategoryId);
}
