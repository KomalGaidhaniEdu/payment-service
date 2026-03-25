package com.prep.paymentservice.entities;

import com.prep.paymentservice.constants.PaymentMethod;
import com.prep.paymentservice.constants.Status;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int userId;

    private double amount;

    private Status status;

    private PaymentMethod paymentMethod;

    public Payments() {
    }

    public Payments(int id, int userId, double amount, Status status, PaymentMethod paymentMethod) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payments payments = (Payments) o;
        return id == payments.id && userId == payments.userId && Double.compare(payments.getAmount(), getAmount()) == 0 && status == payments.status && paymentMethod == payments.paymentMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, getAmount(), status, paymentMethod);
    }

    @Override
    public String toString() {
        return "Payments{" +
                "id=" + id +
                ", userId=" + userId +
                ", amount=" + amount +
                ", status=" + status +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
