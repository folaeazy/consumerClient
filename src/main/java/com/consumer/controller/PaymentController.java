package com.consumer.controller;

import com.consumer.interfaces.PaymentsProxy;
import com.consumer.model.Payment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
//-----------------OPENFIEGN CLIENT METHOD---------------//
//@RestController
//public class PaymentController {
//    private final PaymentsProxy paymentsProxy;
//
//    public PaymentController(PaymentsProxy paymentsProxy) {
//        this.paymentsProxy = paymentsProxy;
//    }
//    @PostMapping("/payment")
//    public Payment createPayment(@RequestBody Payment payment) {
//        String requestId = UUID.randomUUID().toString();
//        return paymentsProxy.createPayment(requestId, payment);
//    }
//
//
//}
//-----------------END-----------------------------//

@RestController
public class PaymentController {
    private  final PaymentsProxy paymentsProxy;

    public PaymentController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }
    @PostMapping("/payment")
    public Payment createPayment( @RequestBody Payment payment) {
        return paymentsProxy.createPayment(payment);
    }
}