package com.example;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> classString = String.class;

        Method[] methods = classString.getDeclaredMethods();

        System.out.println("Methods of the String class:");
        Arrays.stream(methods).forEach(System.out::println);

    }
}
