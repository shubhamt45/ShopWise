package in.codewithshubh.billingsoftware_ecommerce.controller;

import com.razorpay.RazorpayException;
import in.codewithshubh.billingsoftware_ecommerce.io.OrderResponse;
import in.codewithshubh.billingsoftware_ecommerce.io.PaymentRequest;
import in.codewithshubh.billingsoftware_ecommerce.io.PaymentVerificationRequest;
import in.codewithshubh.billingsoftware_ecommerce.io.RazorpayOrderResponse;
import in.codewithshubh.billingsoftware_ecommerce.service.OrderService;
import in.codewithshubh.billingsoftware_ecommerce.service.RazorpayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}
