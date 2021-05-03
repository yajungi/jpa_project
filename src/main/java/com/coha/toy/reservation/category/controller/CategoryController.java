package com.coha.toy.reservation.category.controller;

import com.coha.toy.reservation.category.service.CategoryService;
import com.coha.toy.reservation.common.entity.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/api/categories")
    public ApiResult getCategories() {
        return ApiResult.succeed(categoryService.getCategories());
    }

}
