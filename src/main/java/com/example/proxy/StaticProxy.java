package com.example.proxy;

public class StaticProxy implements ServiceInter {

    private ServiceImpl service;

    public StaticProxy(ServiceImpl service) {
        this.service = service;
    }

    @Override
    public void update() {
        System.out.println("-----Before operation-----");
        service.update();
        System.out.println("-----After operation-----");
    }
}
