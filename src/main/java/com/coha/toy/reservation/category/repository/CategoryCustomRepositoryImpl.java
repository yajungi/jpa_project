package com.coha.toy.reservation.category.repository;

import com.coha.toy.reservation.category.dto.CategoryDto;
import com.coha.toy.reservation.category.entity.Category;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.coha.toy.reservation.category.entity.QCategory.category;
import static com.coha.toy.reservation.display.entity.QDisplay.display;
import static com.coha.toy.reservation.product.entity.QProduct.product;

public class CategoryCustomRepositoryImpl extends QuerydslRepositorySupport implements CategoryCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public CategoryCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        super(Category.class);

        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<CategoryDto> findCategories() {
        return jpaQueryFactory
                .select(Projections.fields(CategoryDto.class,
                        category.id, category.name, category.id.count().as("count")))
                .from(category)
                .join(category.products, product)
                .where(category.id.eq(product.category.id))
                .join(product.displays, display)
                .where(product.id.eq(display.product.id))
                .groupBy(category.id)
                .fetch();
    }
}
