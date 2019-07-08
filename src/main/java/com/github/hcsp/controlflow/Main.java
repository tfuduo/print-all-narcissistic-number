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
        int count = 100;
        int unit = 0;
        int decade = 0;
        int hundreds = 0;
        while (true) {
            unit = count%10;
            decade = (count/10)%10;
            hundreds = count/100;
            if (Math.pow(unit,3) + Math.pow(decade, 3) + Math.pow(hundreds, 3) == count) {
                System.out.println(count);
            }
            if (count > 999) {
                break;
            }
            count ++;
        }
    }
}
