package com.coha.toy.reservation.common.entity;

import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
public class ApiResult<T> {

    private final T data;

    private final String error;

    ApiResult(T data, String error) {
        this.data = data;
        this.error = error;
    }

    public static <T> ApiResult<T> succeed(T data) {
        return new ApiResult<>(data, null);
    }

    public static ApiResult<?> failed(String message) {
        return new ApiResult<>(null, message);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("data", data)
                .append("error", error)
                .toString();
    }

}
