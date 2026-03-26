package com.prep.paymentservice.service;

import com.prep.paymentservice.entities.Payments;
import org.springframework.stereotype.Service;


public interface PaymentService {
    Payments createPayment(Payments payments);

    Payments getPayment(long id);
}
