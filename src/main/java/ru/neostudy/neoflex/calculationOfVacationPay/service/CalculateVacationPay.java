package ru.neostudy.neoflex.calculationOfVacationPay.service;

import ru.neostudy.neoflex.calculationOfVacationPay.model.VacationPay;

public interface CalculateVacationPay {
    VacationPay calculateVacationPay(double avgSalary, int countVacationDay);
}
