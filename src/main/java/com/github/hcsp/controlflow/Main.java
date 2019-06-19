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
        int a,b,c;
        for(int i=100;i<=999;i++){
            String currentNumStr = i + "";
            a = pow3(convertChar2Int(currentNumStr,0));
            b = pow3(convertChar2Int(currentNumStr,1));
            c = pow3(convertChar2Int(currentNumStr,2));
            if((a+b+c)==i){
                System.out.println(i);
            }
        }
    }

    public static int convertChar2Int(String str,int index){
        return Integer.parseInt(str.charAt(index) + "");
    }

    public static int pow3(int base){
        return (int) Math.pow(base,3);
    }
}
