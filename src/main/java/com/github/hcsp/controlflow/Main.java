package com.github.hcsp.controlflow;

import static java.lang.Math.*;
import static java.lang.Math.pow;

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
        /*
          看了优秀答案后
          再一次惊艳到我了，之前在学校里解答水仙花数时
          我就是上一版的写法完成的，完成后就沾沾自喜，没想到还有更好的解法
          而且我还没仔细读好题目，题目指明说了，水仙花数是指一个三位数
          我还在，从i=1开始，真是羞耻万分
          以下参考优秀答案修改
         */

        final int MAX = 999;
        final int MIN = 100;

        for (int i = MIN; i < MAX; i++) {
            int num = (int) (pow(i / 100 % 10, 3) + pow(i / 10 % 10, 3) + pow(i / 1 % 10, 3));
            if (num == i) {
                System.out.println(num);
            }
        }

    }
}
