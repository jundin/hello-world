package com.example.proxy;

public class ServiceImpl implements ServiceInter {
    @Override
    public void update() {
        System.out.println("-----This is an update operation-----");
    }
}
