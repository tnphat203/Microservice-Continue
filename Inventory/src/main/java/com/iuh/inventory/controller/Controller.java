package com.iuh.inventory.controller;

/*
 * File: Controller
 * Author: Tran Ngoc Phat
 * Date: 4/15/2025
 */
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/inventory")
public class Controller {

 @GetMapping("/check")
 public String checkInventory() {
  // Giả lập trạng thái kho (có thể thay bằng DB hoặc random)
  boolean inStock = new Random().nextBoolean(); // 50% còn hàng

  if (inStock) {
   return "Còn hàng";
  } else {
   return "Hết hàng";
  }
 }
}
