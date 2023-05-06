package com.fintech.creditprocessing.controller;


import com.fintech.creditprocessing.domain.dto.LoanOrderDTO;
import com.fintech.creditprocessing.domain.response.Response;
import com.fintech.creditprocessing.domain.response.SuccessResponse;
import com.fintech.creditprocessing.service.LoanOrderService;
import com.fintech.creditprocessing.service.TariffService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Response> getTariffs() {
        return ResponseEntity.ok(new SuccessResponse<>(tariffService.getAllTariffs()));
    }

    @PostMapping("/order")
    public ResponseEntity<Response> addOrder(@RequestBody LoanOrderDTO loanOrderDTO) {
        return ResponseEntity.ok(new SuccessResponse<>(loanOrderService.createCreditApplication(loanOrderDTO)));
    }

    @GetMapping("/getStatusOrder")
    public ResponseEntity<Response> getStatusOrder(@RequestParam("orderId") String orderId) {
        return ResponseEntity.ok(new SuccessResponse<>(loanOrderService.getStatusOrder(orderId)));
    }

    @DeleteMapping("/deleteOrder")
    public ResponseEntity<?> deleteOrder(@RequestBody LoanOrderDTO loanOrderDTO) {
        loanOrderService.deleteOrder(loanOrderDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
