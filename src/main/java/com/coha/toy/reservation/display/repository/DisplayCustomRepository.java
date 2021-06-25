package com.coha.toy.reservation.display.repository;

import com.coha.toy.reservation.display.dto.DisplayDto;

import java.util.List;

public interface DisplayCustomRepository {

    List<DisplayDto> findDisplays(String categoryId, String start);
}
