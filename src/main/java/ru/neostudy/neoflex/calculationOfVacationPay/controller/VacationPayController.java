package ru.neostudy.neoflex.calculationOfVacationPay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neostudy.neoflex.calculationOfVacationPay.model.VacationPay;
import ru.neostudy.neoflex.calculationOfVacationPay.service.CalculateVacationPay;

@RestController
@RequestMapping("/calculacte")
public class VacationPayController {
    private final CalculateVacationPay calculateVacationPay;

    @Autowired
    public VacationPayController(CalculateVacationPay calculateVacationPay) {
        this.calculateVacationPay = calculateVacationPay;
    }

    @GetMapping("{avgSalary}/{countVacationDay}")
    public VacationPay getVacationPay(@PathVariable double avgSalary, @PathVariable int countVacationDay) {
        return calculateVacationPay.calculateVacationPay(avgSalary, countVacationDay);
    }
}
