package sample.cafekiosk.spring.api.controller.product;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sample.cafekiosk.spring.api.service.ProductResponse;
import sample.cafekiosk.spring.api.service.ProductService;

import java.util.List;

@AllArgsConstructor
@RestController
public class ProductController {

    private ProductService productService;

    @PostMapping("/api/v1/products/new")
    public void createProduct(@Valid @RequestBody ProductCreateRequest request) {
        productService.createProduct(request);
    }

    @GetMapping("/api/v1/products/selling")
    public List<ProductResponse> getSellingProducts() {
        return productService.getSellingProducts();
    }


}
