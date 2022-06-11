package com.company.Lambda;

public class LambdaDemo {
    public LambdaDemo(String message){

    }
    public static void show() {
        greet(LambdaDemo::new);
//        greet(message -> System.out.println(message));
//        greet(System.out::println);
//        Printer printer = message -> System.out.println(message);


        //unanimous inner class
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
    }

    public static void greet(Printer printer) {
        printer.print("hello !");
    }
}
