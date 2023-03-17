package com.example.service.impl;

import com.example.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceConsumer {

    @Reference
    private OrderService orderService;

    public boolean createOrder(){
        //TODO 1.先创建概要
        //再循环创建明细
        for (int i = 0; i < 10; i++) {
            boolean details = orderService.createDetails("1", "1");
            if (!details){
                return false;
            }
        }

        return true;
    }
}
