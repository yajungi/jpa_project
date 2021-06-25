package com.coha.toy.reservation.display.image.entity;

import com.coha.toy.reservation.display.entity.Display;

import javax.persistence.*;

@Entity
@Table(name = "display_info_image")
public class DisplayImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "display_info_id")
    private Display display;

    public void setDisplay(Display display) {
        this.display = display;
    }

    private long fileId;

}
