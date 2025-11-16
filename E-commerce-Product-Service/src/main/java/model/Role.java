package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", unique = true, nullable = false)
    private String name; // Ví dụ: "ROLE_USER", "ROLE_ADMIN"

    // MappedBy chỉ ra rằng User là bên quản lý mối quan hệ này
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Set<User> Users;
}