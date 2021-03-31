package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ThreadIteratorTest {
    private static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add("1");
        list.add("2");
        list.add("3");

        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    list.add("123");// 添加数据
                }
            }).start();
        }

        Iterator<String> iter = list.iterator();
        // 执行3个任务(我当前正在迭代集合（这里模拟并发中读取某一list的场景）)
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (iter.hasNext()) {
                        System.out.println(iter.next());
                    }
                }
            }).start();
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
