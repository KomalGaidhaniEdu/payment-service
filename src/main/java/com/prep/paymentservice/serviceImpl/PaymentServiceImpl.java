package com.prep.paymentservice.serviceImpl;

import com.prep.paymentservice.dto.PaymentDTO;
import com.prep.paymentservice.entities.Payments;
import com.prep.paymentservice.exceptions.ResourceNotFoundException;
import com.prep.paymentservice.repository.PaymentRepository;
import com.prep.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
                .orElseThrow(() -> new ResourceNotFoundException("payment with " + id + " not found"));
    }

    @Override
    public Payments updatePayment(long id, PaymentDTO paymentDTO) {
        Payments oldPayment = paymentRepository.findById(id)
                .orElseThrow(() ->  new ResourceNotFoundException("payment with " + id + " not found"));
            Payments updatedPayment = Payments.builder()
                    .id(id)
                    .amount(oldPayment.getAmount())
                    .userId(oldPayment.getUserId())
                    .status(paymentDTO.getStatus())
                    .paymentMethod(oldPayment.getPaymentMethod()).build();
        return paymentRepository.save(updatedPayment);
    }

    @Override
    public String deletePayment(long id) {
        Payments payment =  paymentRepository.findById(id).orElseThrow(() ->  new ResourceNotFoundException("payment with " + id + " not found"));

        paymentRepository.deleteById(id);
        return "payment with id " + id + " deleted";
    }

}
