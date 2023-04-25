package com.fintech.creditprocessing.controller;


import com.fintech.creditprocessing.dto.LoanOrderDTO;
import com.fintech.creditprocessing.service.LoanOrderService;
import com.fintech.creditprocessing.service.TariffService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan-service")
@RequiredArgsConstructor
@Slf4j
public class LoanServiceController {

    private final LoanOrderService loanOrderService;
    private final TariffService tariffService;


    @GetMapping("/getTariffs")
    public ResponseEntity<?> getTariffs() {
        return ResponseEntity.ok(tariffService.getAllTariffs());
    }

    @PostMapping("/order")
    public ResponseEntity<?> addOrder(@RequestBody LoanOrderDTO loanOrderDTO) {
        return ResponseEntity.ok(loanOrderService.createCreditApplication(loanOrderDTO));
    }

    @GetMapping("/getStatusOrder")
    public ResponseEntity<?> getStatusOrder(@RequestParam("orderId") String orderId) {
        return ResponseEntity.ok(loanOrderService.getStatusOrder(orderId));
    }


}
