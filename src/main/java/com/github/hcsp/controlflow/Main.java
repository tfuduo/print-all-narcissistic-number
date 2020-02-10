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
        int bit, ten, hunderd, sum;
        for (int i = 0; i < 1000; i++) {
            bit = i % 10;
            ten = i / 10 % 10;
            hunderd = i / 100;
            sum = bit * bit * bit + ten * ten * ten + hunderd * hunderd * hunderd;

            if (sum == i) System.out.println(sum);
        }
    }
}

