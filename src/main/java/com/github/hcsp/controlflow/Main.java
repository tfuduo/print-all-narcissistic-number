package com.github.hcsp.controlflow;

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
        int num = 100;
        for (; num <= 999; num++) {
            int ps = num % 10;
            int pr = num / 10 % 10;
            int pe = num / 100;
            if (num == Math.pow(ps, 3) + Math.pow(pr, 3) + Math.pow(pe, 3)) {
                System.out.println(num);
            }
        }
    }
}
