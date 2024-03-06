package swiggyDemo;

import swiggyDemo.model.PaymentRequest;
import swiggyDemo.model.PaymentResponse;

public interface SwiggyPaymentService {
    PaymentResponse payment(PaymentRequest request);
}
