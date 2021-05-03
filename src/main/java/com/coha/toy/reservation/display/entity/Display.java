package com.coha.toy.reservation.display.entity;

import com.coha.toy.reservation.common.entity.BaseTime;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="display_info")
@Getter
public class Display extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="product_id")
    private String productId;

    @Column(name="opening_hours")
    private String openingHours;

    @Column(name="place_name")
    private String placeName;

    @Column(name="place_lot")
    private String placeLot;

    @Column(name="place_street")
    private String placeStreet;

    @Column(name="tel")
    private String telephone;

    @Column(name="homepage")
    private String homepage;

    @Column(name="email")
    private String email;

}
