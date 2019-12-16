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
//        for (int number=100; number < 1000; number++) {
//            int sumOfNumber = number;
//            for (char figureChar : (Integer.toString(number)).toCharArray()){
//                int figure =  figureChar - '0';
//                sumOfNumber -= figure*figure*figure;
//            }
//            if (sumOfNumber == 0) System.out.println(number);
//        }
        int hundredsDigit, tensDigit, unitDigit;
        for (int number=100; number < 1000; number++) {
            hundredsDigit = number/100;
            unitDigit = number%10;
            tensDigit = number/10 - hundredsDigit*10;
            if (number == unitDigit*unitDigit*unitDigit + hundredsDigit*hundredsDigit*hundredsDigit +
                          tensDigit*tensDigit*tensDigit){
                System.out.println(number);
            }
        }
    }
}
