package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private Object target;

    // Bind the delegate object and return a proxy class
    public Object bind(Object target) {
        this.target = target;
        // get the proxy object
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----Before operation-----");
        Object ret = method.invoke(target,args);
        System.out.println("-----After operation-----");
        return ret;
    }
}
