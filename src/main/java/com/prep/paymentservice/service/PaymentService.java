package com.prep.paymentservice.service;

import com.prep.paymentservice.dto.PaymentDTO;
import com.prep.paymentservice.entities.Payments;
import org.springframework.stereotype.Service;


public interface PaymentService {
    Payments createPayment(Payments payments);

    Payments getPayment(long id);

    Payments updatePayment(long id, PaymentDTO paymentDTO);

    String deletePayment(long id);
}
