package com.prep.paymentservice.dto;

import com.prep.paymentservice.constants.PaymentMethod;
import com.prep.paymentservice.constants.Status;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Builder
public class ResponseDTO {

    private HttpStatus status;

    private String error;

    private String message;
}
