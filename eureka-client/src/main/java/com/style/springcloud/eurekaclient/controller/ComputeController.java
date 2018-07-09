package com.style.springcloud.eurekaclient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 算法的控制类
 * @author  Gaofei 2018-07-05
 *
 */
@RestController
public class ComputeController {


    /**
     * 加法
     * @param operand1
     * @param operand2
     * @return
     */
    @GetMapping("/add")
    public Integer add(@RequestParam Integer operand1, @RequestParam Integer operand2) {
        int sum = operand1 + operand2;
        System.out.println(sum);
        return sum;
    }



}
