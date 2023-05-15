package com.example.tacocloud.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.tacocloud.Order;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping(value = "current")
    public String orderFormString(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PostMapping()
    public String processOrder(@Valid Order order, Errors errors) {
        if (errors.hasErrors())
            return "orderForm";
        log.info("Order submitted: " + order);
        return "redirect:/";
    }

}
