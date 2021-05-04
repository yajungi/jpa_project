package com.coha.toy.reservation.category.repository;

import com.coha.toy.reservation.category.dto.CategoryDto;
import com.coha.toy.reservation.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {

    @Query("select new com.coha.toy.reservation.category.dto.CategoryDto(c.id, c.name, count(c.id)) " +
            "from Category c " +
            "join Product p on c.id = p.category.id " +
            "join Display d on p.id = d.product.id " +
            "group by c.id")
    List<CategoryDto> findCategories();

}
