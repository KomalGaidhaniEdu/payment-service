package com.prep.paymentservice.controller;

import com.prep.paymentservice.entities.Payments;
import com.prep.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/payments/api")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    private Payments create(@RequestBody Payments payments){
        return paymentService.createPayment(payments);

    }

    @GetMapping("/payments/{id}")
    private Payments getPayment(@PathVariable("id") long id){
        return paymentService.getPayment(id);
    }


}
