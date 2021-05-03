package com.coha.toy.reservation.category.repository;

import com.coha.toy.reservation.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {

    @Query("select ")
    List<Category> findAllCategories();

}
