package ru.neostudy.neoflex.calculationOfVacationPay.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VacationPay {
    private double amountVacationPay;


    public VacationPay() {
    }

    public VacationPay(double amountVacationPay) {
        this.amountVacationPay = amountVacationPay;
    }
}
