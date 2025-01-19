package sample.cafekiosk.spring.api.controller.order;

import lombok.Builder;
import lombok.Getter;
import sample.cafekiosk.spring.domain.order.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class OrderCreateRequest {

    private List<String> productNumbers;

    private OrderStatus orderStatus;

    private LocalDateTime registeredDateTime;

    @Builder
    public OrderCreateRequest(List<String> productNumbers, OrderStatus orderStatus, LocalDateTime registeredDateTime) {
        this.productNumbers = productNumbers;
        this.orderStatus = orderStatus;
        this.registeredDateTime = registeredDateTime;
    }
}
