package in.codewithshubh.billingsoftware_ecommerce.repository;

import in.codewithshubh.billingsoftware_ecommerce.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {
}
