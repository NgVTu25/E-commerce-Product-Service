package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer rating; // 1-5 sao

    @Column(columnDefinition = "TEXT")
    private String comment;

    private boolean isApproved = false; // Chờ admin duyệt

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // --- Relationships ---

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    // Ghi chú: Nếu bạn muốn review cả Dịch vụ,
    // bạn có thể thêm @ManyToOne Service (nullable = true)
    // hoặc tạo bảng ServiceReview riêng biệt.
}