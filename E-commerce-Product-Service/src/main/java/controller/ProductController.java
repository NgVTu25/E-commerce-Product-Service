package controller;

import dto.CreateProductRequest;
import dto.ProductDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET /api/v1/products
    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products); // Trả về 200 OK
    }

    // GET /api/v1/products/123
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        // (Trong thực tế, nên dùng try-catch hoặc @ControllerAdvice để xử lý lỗi)
        ProductDTO product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    // POST /api/v1/products
    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody CreateProductRequest request) {
        // TODO: Lấy sellerId từ context bảo mật (Spring Security / JWT)
        Long sellerId = 1L; // Cần thay thế bằng logic lấy user

        ProductDTO newProduct = productService.createProduct(request, sellerId);

        // Trả về 201 Created
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
}
