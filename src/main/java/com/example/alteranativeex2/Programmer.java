package com.example.alteranativeex2;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class Programmer implements Employee{
    @Override
    public void doWork() {
        System.out.println("Programmer do work");

    }
}
