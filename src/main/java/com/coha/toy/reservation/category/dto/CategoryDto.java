package com.coha.toy.reservation.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

    private long id;

    private String name;

    private long count;

    public CategoryDto(long id, String name, long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

}
