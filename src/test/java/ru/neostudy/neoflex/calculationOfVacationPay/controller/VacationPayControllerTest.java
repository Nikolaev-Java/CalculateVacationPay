package ru.neostudy.neoflex.calculationOfVacationPay.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import ru.neostudy.neoflex.calculationOfVacationPay.model.VacationPay;
import ru.neostudy.neoflex.calculationOfVacationPay.service.CalculateVacationPayImpl;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static ru.neostudy.neoflex.calculationOfVacationPay.matcher.ResponseBodyMatcher.responseBody;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class VacationPayControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @Mock
    private CalculateVacationPayImpl calculateVacationPay;
    private static final String PATH = "/calculacte";

    @Test
    void calculateVacationPayTest01() throws Exception {
        double avgSalary = 1706.48;
        int vacationDay = 28;
        VacationPay expected = new VacationPay(avgSalary * vacationDay);
        String body = objectMapper.writeValueAsString(expected);
        mockMvc.perform(get(PATH + "/" + avgSalary + "/" + vacationDay)
                        .contentType("aplication/json"))
                .andExpect(status().isOk())
                .andExpect(responseBody().containsObjectAsJson(expected, VacationPay.class));
    }

    @Test
    void calculateVacationPayTest02() throws Exception {
        double avgSalary = 1194.53;
        int vacationDay = 7;
        VacationPay expected = new VacationPay(avgSalary * vacationDay);
        String body = objectMapper.writeValueAsString(expected);
        mockMvc.perform(get(PATH + "/" + avgSalary + "/" + vacationDay)
                        .contentType("aplication/json"))
                .andExpect(status().isOk())
                .andExpect(responseBody().containsObjectAsJson(expected, VacationPay.class));
    }

    @Test
    void calculateVacationPayTest03() throws Exception {
        double avgSalary = 2218.43;
        int vacationDay = 14;
        VacationPay expected = new VacationPay(avgSalary * vacationDay);
        String body = objectMapper.writeValueAsString(expected);
        mockMvc.perform(get(PATH + "/" + avgSalary + "/" + vacationDay)
                        .contentType("aplication/json"))
                .andExpect(status().isOk())
                .andExpect(responseBody().containsObjectAsJson(expected, VacationPay.class));
    }
}