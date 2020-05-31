package com.lindos.spring.hello;

import javax.swing.*;

public class HelloMain
{
    public static final void main(String[] args)
    {
        MessageConfigurator configurator = MessageConfigurator.getInstance();
        MessageProvider provider = configurator.getProvider();
        MessageRenderer renderer = configurator.getRenderer();
        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
