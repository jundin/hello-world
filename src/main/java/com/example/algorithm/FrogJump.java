package com.example.algorithm;

public class FrogJump {
    // 青蛙可以一次跳一个台阶或者一次两个台阶,跳N层台阶有多少种方式
    public static int fun(int n) {
        if(n < 0) {
            return 0;
        } else if(n ==1) {
             return 1;
         } else if(n ==2) {
             return 2;
         } else {
             return fun(n-1) + fun(n-2);
         }
    }
    public static void main(String[] strs) {
        System.out.println(fun(7));
    }
}
