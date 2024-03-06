package swiggyDemo.model;

import swiggyDemo.SwiggyPaymentService;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {

    public PaymentResponse payment(PaymentRequest request){
        PaymentRequest paymentInitiationRequest=new PaymentRequest("Swiggy"+UUID.randomUUID().toString(),
                request.getAmt(),request.getTxnDate(),"5555",false);

        SBIBankService sbiBankService=new SBIBankService();
        return sbiBankService.transfer(paymentInitiationRequest);
    }
}
