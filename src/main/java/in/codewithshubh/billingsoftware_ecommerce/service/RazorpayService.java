package in.codewithshubh.billingsoftware_ecommerce.service;

import com.razorpay.RazorpayException;
import in.codewithshubh.billingsoftware_ecommerce.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
