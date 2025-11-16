package service;

import dto.CreateProductRequest;
import dto.ProductDTO;
import model.Category;
import model.Product;
import model.ProductImage;
import model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import responsive.CategoryRepository;
import responsive.ProductRepository;
import responsive.UserRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    private ProductDTO toProductDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .stockQuantity(product.getStockQuantity())
                .categoryName(product.getCategory() != null ? product.getCategory().getName() : null)
                .sellerName(product.getSeller() != null ? product.getSeller().getFullName() : null)
                .imageURLs(product.getImages().stream()
                        .map(ProductImage::getImageUrl)
                        .collect(Collectors.toList()))
                .build();
    }

    @Override
    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id)); // Nên tạo Exception tùy chỉnh

        return toProductDTO(product);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(this::toProductDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public ProductDTO createProduct(CreateProductRequest request, Long sellerId) {
        // Tìm các entity liên quan
        Category category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        User seller = userRepository.findById(sellerId)
                .orElseThrow(() -> new RuntimeException("Seller not found"));

        Product newProduct = new Product();
        newProduct.setName(request.getName());
        newProduct.setDescription(request.getDescription());
        newProduct.setPrice(request.getPrice());
        newProduct.setStockQuantity(request.getStockQuantity());
        newProduct.setCategory(category);
        newProduct.setSeller(seller);
        newProduct.setCreatedAt(LocalDateTime.now());
        newProduct.setUpdatedAt(LocalDateTime.now());

        // Lưu vào CSDL
        Product savedProduct = productRepository.save(newProduct);

        // Trả về DTO
        return toProductDTO(savedProduct);
    }
}
