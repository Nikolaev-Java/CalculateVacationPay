package ru.neostudy.neoflex.calculationOfVacationPay.service;

import org.springframework.stereotype.Service;
import ru.neostudy.neoflex.calculationOfVacationPay.model.VacationPay;

@Service
public class CalculateVacationPayImpl implements CalculateVacationPay {
    @Override
    public VacationPay calculateVacationPay(double avgSalary, int countVacationDay) {
        double countSalaryPay = avgSalary * countVacationDay;
        return new VacationPay(countSalaryPay);
    }
}
