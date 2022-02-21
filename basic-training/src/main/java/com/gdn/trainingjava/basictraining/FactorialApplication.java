package com.gdn.trainingjava.basictraining;

import java.util.Scanner;

public class FactorialApplication {
    private final int numFact;
    public int factRes = 1;

    FactorialApplication(int number) {
        if (number == -404) {
            Scanner input = new Scanner(System.in);
            System.out.print("input number: ");
            this.numFact = input.nextInt();
        } else {
            this.numFact = number;
        }
        factorial();
    }

    private void factorial() {
        for (int i = 1; i <= numFact; i++) {
            factRes *= i;
        }
    }

    public static void main(String[] args) {
        FactorialApplication factr = new FactorialApplication(-404);
        System.out.printf("factorial: %d", factr.factRes);
    }
}
