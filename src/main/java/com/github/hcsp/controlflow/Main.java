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
        for (int i = 100; i < 1000; i++) {
            if(judge(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean judge(int number){
        int digit1 = number/100;
        int digit2 = (number%100)/10;
        int digit3 = number%10;
        return Math.pow(digit1,3)+Math.pow(digit2,3)+Math.pow(digit3,3)==number;

    }
}
