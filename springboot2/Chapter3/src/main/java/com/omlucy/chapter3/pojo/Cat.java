package com.omlucy.chapter3.pojo;

import com.omlucy.chapter3.pojo.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * @author lucy
 * @date 2021/11/1
 */
@Component
public class Dog implements Animal {
    @Override
    public void user() {
        System.out.println("dog");
    }
}
