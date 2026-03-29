package com.prep.paymentservice.dto;

import com.prep.paymentservice.constants.PaymentMethod;
import com.prep.paymentservice.constants.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Builder
public class PaymentDTO {

    private long id;
    private int userId;
    private double amount;
    private Status status;
    private PaymentMethod paymentMethod;
}
