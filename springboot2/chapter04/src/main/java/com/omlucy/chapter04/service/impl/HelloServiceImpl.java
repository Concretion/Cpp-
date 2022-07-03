package com.omlucy.chapter04.impl;

import com.omlucy.chapter04.service.HelloService;

/**
 * @author lucy
 * @date 2021/11/8
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name == null || "".equals(name.trim())) {
            throw new RuntimeException("parameter is null!");
        }
        System.out.println("hello " + name);
    }
}
