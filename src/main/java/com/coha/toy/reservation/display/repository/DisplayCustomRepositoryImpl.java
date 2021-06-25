package com.coha.toy.reservation.display.repository;

import com.coha.toy.reservation.category.entity.QCategory;
import com.coha.toy.reservation.display.dto.DisplayDto;
import com.coha.toy.reservation.display.entity.Display;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.coha.toy.reservation.category.entity.QCategory.category;
import static com.coha.toy.reservation.display.entity.QDisplay.display;
import static com.coha.toy.reservation.display.image.entity.QDisplayImage.displayImage;
import static com.coha.toy.reservation.product.entity.QProduct.product;

public class DisplayCustomRepositoryImpl extends QuerydslRepositorySupport implements DisplayCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public DisplayCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(Display.class);

        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<DisplayDto> findDisplays(String categoryId, String start) {
        return jpaQueryFactory.select(
                Projections.fields(DisplayDto.class,
                        product.id, category.id.as("categoryId"), display.id.as("displayId"),
                        category.name, product.description, product.content, product.event,
                        display.openingHours, display.placeName, display.placeLot,
                        display.placeStreet, display.telephone, display.homepage,
                        display.email, display.createDate, display.modifyDate, displayImage.fileId
                ))
                .from(display)
                .join(product)
                .on(display.product.id.eq(product.id))
                .join(category)
                .on(product.category.id.eq(category.id))
                .join(displayImage)
                .on(display.id.eq(displayImage.display.id))
                .where(category.id.eq(Long.valueOf(categoryId)))
                .limit(4)
                .offset(Long.valueOf(start))
                .fetch();
    }

    private BooleanExpression eqDisplayId(String displayId) {
        if(StringUtils.isEmpty(displayId)) {
            return null;
        }

        return display.id.eq(Long.valueOf(displayId));
    }

}
