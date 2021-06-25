package com.coha.toy.reservation.display.service;

import com.coha.toy.reservation.display.dto.DisplayDto;
import com.coha.toy.reservation.display.repository.DisplayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DisplayService {

    private final DisplayRepository displayRepository;

    public List<DisplayDto> getDisplays(String categoryId, String start) {
        return displayRepository.findDisplays(categoryId, start);
    }

}
