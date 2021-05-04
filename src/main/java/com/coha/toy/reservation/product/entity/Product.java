package com.coha.toy.reservation.product.entity;

import com.coha.toy.reservation.category.entity.Category;
import com.coha.toy.reservation.common.entity.BaseTime;
import com.coha.toy.reservation.display.entity.Display;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="product")
@Getter
public class Product extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    @Column(name = "event")
    private String event;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public void setCategory(Category category) {
        this.category = category;
    }

    @OneToMany(mappedBy = "product")
    private List<Display> displays;

}
