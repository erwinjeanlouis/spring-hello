package com.lindos.spring.hello;

public interface MessageRenderer
{
    public void setMessageProvider(MessageProvider m);
    public void render();
}
