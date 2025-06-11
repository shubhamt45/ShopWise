package in.codewithshubh.billingsoftware_ecommerce.repository;

import in.codewithshubh.billingsoftware_ecommerce.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByCategoryId(String categoryId);
}
