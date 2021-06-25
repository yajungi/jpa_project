package com.coha.toy.reservation.category.controller;

import com.coha.toy.reservation.category.dto.CategoryDto;
import com.coha.toy.reservation.category.dto.CategoryResult;
import com.coha.toy.reservation.category.service.CategoryService;
import com.coha.toy.reservation.common.entity.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.coha.toy.reservation.common.entity.ApiResult.succeed;

@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/api/categories")
    public ResponseEntity<ApiResult> getCategories() {
        List<CategoryDto> categoryDtos = categoryService.getCategories();

        return ResponseEntity.ok(succeed(new CategoryResult(categoryDtos.size(), categoryDtos)));
    }

}
