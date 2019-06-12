package com.github.hcsp.controlflow;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printNarcissisticNumber();
    }

    /**
     * 打印所有的水仙花数。水仙花数是指一个三位数，其各位数字立方和等于该数本身。
     *
     * <p>例如，153是一个水仙花数，因为1的立方方+5的立方+3的立方 = 153
     *
     * <p>提示：可用除法和求余运算得到一个数字的个、十、百位上的数字。
     */
    public static void printNarcissisticNumber() {

        IntStream.rangeClosed(100, 999)
                .filter(x -> isNarcissisticNumber(x))
                .forEach(x -> System.out.println(x));
    }

    /* 判断value是否为水仙花数 */
    public static boolean isNarcissisticNumber(int value) {
        int temp = value;
        int digits = 0;
        // 判断value有几位数，保存在digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = value;
        int sum = 0;
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == value;
    }
}
