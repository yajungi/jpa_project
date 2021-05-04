package com.coha.toy.reservation.category.service;

import com.coha.toy.reservation.category.dto.CategoryDto;
import com.coha.toy.reservation.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDto> getCategories() {

        return categoryRepository.findCategories();
    }

}
