package com.example.proxy;

public class TestProxy {
    public static void main(String[] args) {

        StaticProxy staticProxy = new StaticProxy(new ServiceImpl());
        staticProxy.update();

        JDKProxy jdkProxy = new JDKProxy();
        ServiceInter serviceInter = (ServiceInter) jdkProxy.bind(new ServiceImpl());
        serviceInter.update();

        CglibProxy cglibProxy = new CglibProxy();
        Service service = (Service) cglibProxy.getInstance(new Service());
        service.update();
    }
}
