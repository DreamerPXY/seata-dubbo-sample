package com.example.service.impl;

import com.example.service.OrderService;
import org.springframework.stereotype.Service;

@Service
@org.apache.dubbo.config.annotation.Service
public class OrderServiceImpl implements OrderService {
    @Override
    public boolean createDetails(String orderId, String orderName) {
        return false;
    }
}
