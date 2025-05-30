package com.consumer.interfaces;

import com.consumer.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.UUID;




//-----------------OPENFEIGN CLIENT METHOD-------------------//

//@FeignClient(name = "payments", url = "${name.service.url}")
//public interface PaymentsProxy {
//
//    @PostMapping("/payment")
//    Payment createPayment(@RequestHeader String requestId, @RequestBody Payment payment);
//
//
//
//}

//----------------------------END------------------------//

//---------------------------REST TEMPLATE TYPE-------------------//

@Component
public class PaymentsProxy {

    private final RestTemplate restTemplate;

    @Value("${name.service.url}")
    private String paymentServiceUrl;


    public PaymentsProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment createPayment(Payment payment) {
        String url = paymentServiceUrl + "/payment";
        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId", UUID.randomUUID().toString());

        // creating HTTP entity of the request body
        HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers);
        ResponseEntity<Payment> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, Payment.class);
        return response.getBody();
    }
}
//--------------------------END---------------------------//