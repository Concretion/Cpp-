package com.omlucy.chapter3.pojo;

import com.omlucy.chapter3.pojo.definition.Animal;
import com.omlucy.chapter3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lucy
 * @date 2021/11/1
 */
@Component
public class BussinessPerson implements Person {
    @Autowired
    private Animal animal;

    @Override
    public void service() {
        this.animal.user();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
