package com.coha.toy.reservation.display.controller;

import com.coha.toy.reservation.common.entity.ApiResult;
import com.coha.toy.reservation.display.service.DisplayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.coha.toy.reservation.common.entity.ApiResult.succeed;

@RestController
@RequiredArgsConstructor
public class DisplayController {

    private final DisplayService displayService;

    @GetMapping("/api/displayinfos")
    public ResponseEntity<ApiResult> getDisplayInfos(@RequestParam("categoryId") String categoryId,
                                                    @RequestParam("start") String start) {

        return ResponseEntity.ok(succeed(displayService.getDisplays(categoryId, start)));
    }
}
