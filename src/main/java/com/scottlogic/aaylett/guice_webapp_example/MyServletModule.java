package com.scottlogic.aaylett.guice_webapp_example;

import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule {

    @Override
    protected void configureServlets() {
        super.configureServlets();
        serve("/").with(TestServlet.class);
        bind(String.class).toInstance("Hello, World!");
    }
}
