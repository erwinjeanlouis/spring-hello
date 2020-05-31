package com.lindos.spring.hello;

import static java.lang.System.*;

public class ConsoleMessageRenderer implements MessageRenderer {
    private MessageProvider provider;

    @Override
    public void setMessageProvider(MessageProvider m)
    {
        this.provider = m;
    }

    @Override
    public void render()
    {
        out.println(this.provider.getMessage());
    }
}
