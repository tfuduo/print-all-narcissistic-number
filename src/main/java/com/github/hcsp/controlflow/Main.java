package com.github.hcsp.controlflow;

import java.util.ArrayList;

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
        ArrayList<String> str= new ArrayList<>();
        for (int i = 100; i <1000 ; i++) {//遍历所有的三位数
            int a=i/100;//将百分位数赋给a;
            int b=(i%100)/10;//将十分位数赋给b；
            int c=(i%10);//将个位数赋值给c；
            if(i==(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))){
                str.add(String.valueOf(i));
            }
        }
               System.out.println("所有的水仙花数包括："+String.join(",",str)+"。");
    }
}
