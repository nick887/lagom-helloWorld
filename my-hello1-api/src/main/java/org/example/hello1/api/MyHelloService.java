package org.example.hello1.api;

import com.lightbend.lagom.javadsl.api.*;

import static com.lightbend.lagom.javadsl.api.Service.*;

public interface MyHelloService  {

    ServiceCall<String,String> sayHello();

    default Descriptor descriptor(){
        return named("hello").withCalls(namedCall("hello",this::sayHello));
    }
}
