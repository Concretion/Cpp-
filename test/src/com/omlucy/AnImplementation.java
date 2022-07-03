package com.omlucy;

/**
 * @author lucy
 * @date 2021/9/19
 */
public class AnImplementation implements AnInterface{

    @Override
    public void firstMethod() {

    }

    @Override
    public void secondMethod() {

    }

    public void main(String[] args) {
        AnInterface.super.thirdMethod();

    }
}
