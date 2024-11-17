package com.raon.demos.middle1.lang.inner.local;

public class AnnonymosOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        AnnonymosOuter main = new AnnonymosOuter();
        main.process(2);
    }
}
