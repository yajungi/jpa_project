package com.coha.toy.reservation.category.repository;

import com.coha.toy.reservation.category.dto.CategoryDto;

import java.util.List;

public interface CategoryCustomRepository {

    List<CategoryDto> findCategories();
}
