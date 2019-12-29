package com.github.hcsp.controlflow;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        printNarcissisticNumber();
    }

    /**
     * 打印所有的水仙花数。水仙花数是指一个三位数，其各位数字立方和等于该数本身。
     *
     * <p>例如，153是一个水仙花数，因为1的立方+5的立方+3的立方 = 153
     *
     * <p>提示：可用除法和求余运算得到一个数字的个、十、百位上的数字。
     */
    public static void printNarcissisticNumber() {
        int ge, shi, bai, temp;

        for (int i = 1; i < 1000; i++) {
            ge = i % 10;
            shi = (i % 100 - ge) / 10;
            bai = i / 100;

            temp = (int) (pow(ge, 3) + pow(shi, 3) + pow(bai, 3));

            if (i == temp)
                System.out.print(i+",");
        }
    }
}
