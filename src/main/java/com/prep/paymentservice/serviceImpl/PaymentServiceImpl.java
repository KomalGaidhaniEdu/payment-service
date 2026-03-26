package com.prep.paymentservice.serviceImpl;

import com.prep.paymentservice.entities.Payments;
import com.prep.paymentservice.repository.PaymentRepository;
import com.prep.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payments createPayment(Payments payments) {
        System.out.println(payments);
        return paymentRepository.save(payments);
    }

    @Override
    public Payments getPayment(long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("payment with " + id + "not found"));
    }
}
