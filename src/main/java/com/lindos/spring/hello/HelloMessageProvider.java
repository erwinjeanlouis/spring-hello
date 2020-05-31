package com.lindos.spring.hello;

public class HelloMessageProvider implements MessageProvider
{
    @Override
    public String getMessage()
    {
        return "Hello World!";
    }
}
