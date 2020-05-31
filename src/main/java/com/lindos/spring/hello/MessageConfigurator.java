package com.lindos.spring.hello;

import java.util.Properties;

public class MessageConfigurator
{
    private static MessageConfigurator configurator;
    MessageProvider provider;
    MessageRenderer renderer;

    private MessageConfigurator()
    {
        try
        {
            Properties prop = new Properties();
            prop.load(getClass().getResourceAsStream("/config.properties"));
            provider = (MessageProvider) Class.forName(prop.getProperty("provider")).getDeclaredConstructor().newInstance();
            renderer = (MessageRenderer) Class.forName(prop.getProperty("renderer")).getDeclaredConstructor().newInstance();
        }
        catch (Exception exp)
        {
            exp.printStackTrace();
            throw  new RuntimeException(exp.getMessage());
        }

    }

    public MessageRenderer getRenderer()
    {
        return renderer;
    }

    public MessageProvider getProvider()
    {
        return provider;
    }

    public static MessageConfigurator getInstance()
    {
        return configurator;
    }

    static
    {
        configurator = new MessageConfigurator();
    }
}
