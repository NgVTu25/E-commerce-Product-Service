package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    // --- Relationships ---

    // Quan hệ tự thân (Self-referencing) để làm danh mục cha
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;

    // Danh sách các danh mục con
    @OneToMany(mappedBy = "parentCategory", fetch = FetchType.LAZY)
    private List<Category> childCategories;

    // Danh sách các sản phẩm thuộc danh mục này
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> products;
}