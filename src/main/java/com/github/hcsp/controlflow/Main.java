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
        int hundred=0;int ten=0;int individual=0;
        System.out.println("所有的水仙花数:");
        for (int i=100;i<=999;i++){
            hundred=i/100;ten=i/10%10;individual=i%10;
            if(i==Math.pow(hundred,3)+Math.pow(ten,3)+Math.pow(individual,3)){
                System.out.print(i+"\t");
            }
        }
    }
}
