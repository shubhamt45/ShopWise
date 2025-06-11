package in.codewithshubh.billingsoftware_ecommerce.service;

import in.codewithshubh.billingsoftware_ecommerce.io.OrderRequest;
import in.codewithshubh.billingsoftware_ecommerce.io.OrderResponse;
import in.codewithshubh.billingsoftware_ecommerce.io.PaymentVerificationRequest;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
