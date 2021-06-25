package com.coha.toy.reservation.category.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CategoryResult {

    private int count;

    private List<CategoryDto> items;

}
