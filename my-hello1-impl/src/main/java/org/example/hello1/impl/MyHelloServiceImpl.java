package org.example.hello1.impl;

import com.lightbend.lagom.javadsl.api.ServiceCall;
import org.example.hello1.api.*;
import static java.util.concurrent.CompletableFuture.completedFuture;
/**
 * @author nick
 * @Classname MyHelloServiceImpl
 * @Description TODO
 * @Date 2021/7/4 2:57 上午
 * @Created by txiao
 */
public class MyHelloServiceImpl implements MyHelloService{
    public ServiceCall<String,String> sayHello(){
        return name -> completedFuture("Hello "+name);
    }
}
