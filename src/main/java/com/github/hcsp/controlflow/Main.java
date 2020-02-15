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
        for (int n = 100; n < 1000; n++) {
            int 个位 = n % 10;
            int 十位 = n / 10 % 10;
            int 百位 = n / 100;
            if (Math.pow(个位, 3) + Math.pow(十位, 3) + Math.pow(百位, 3) == n) {
                System.out.println(n);
            }
        }
    }
}
