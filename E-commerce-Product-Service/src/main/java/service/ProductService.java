package service;

import dto.CreateProductRequest;
import dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO getProductById(Long id);
    List<ProductDTO> getAllProducts();
    ProductDTO createProduct(CreateProductRequest request, Long sellerId);
}
