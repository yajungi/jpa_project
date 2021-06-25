package com.coha.toy.reservation.display.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class DisplayDto {

    private long id;

    private long categoryId;

    private long displayId;

    private String name;

    private String description;

    private String content;

    private String event;

    private String openingHours;

    private String placeName;

    private String placeLot;

    private String placeStreet;

    private String telephone;

    private String homepage;

    private String email;

    private long fileId;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

}
