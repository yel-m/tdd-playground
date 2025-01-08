package sample.cafekiosk.unit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Order {
    private final LocalDateTime orderLocalDateTime;
    private final List<Beverage> beverages;
}
