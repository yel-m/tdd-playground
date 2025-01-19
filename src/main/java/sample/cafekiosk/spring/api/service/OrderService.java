package sample.cafekiosk.spring.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sample.cafekiosk.spring.api.controller.order.OrderCreateRequest;
import sample.cafekiosk.spring.domain.order.Order;
import sample.cafekiosk.spring.domain.order.OrderRepository;
import sample.cafekiosk.spring.domain.product.Product;
import sample.cafekiosk.spring.domain.product.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public OrderResponse createOrder(OrderCreateRequest request, LocalDateTime registeredTime) {
        List<String> productNumbers = request.getProductNumbers();

        // Product
        List<Product> products = productRepository.findAllByProductNumberIn(request.getProductNumbers());

        Order order = Order.create(products, registeredTime);

        Order savedOrder = orderRepository.save(order);

        // Order
        return OrderResponse.of(savedOrder);
    }
}
