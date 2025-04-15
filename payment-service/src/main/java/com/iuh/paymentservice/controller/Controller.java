package com.iuh.paymentservice.controller;

/*
 * File: Controller
 * Author: Tran Ngoc Phat
 * Date: 4/15/2025
 */
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class Controller {
    @GetMapping("/status")
    public String getStatus() {
        return "Đã thanh toán";
    }

    @PostMapping("/process")
    public String processPayment(@RequestParam double amount) {
        if (amount <= 0) {
            return "Thanh toán thất bại: số tiền không hợp lệ.";
        }
        return "Thanh toán thành công số tiền: " + amount;
    }
}
