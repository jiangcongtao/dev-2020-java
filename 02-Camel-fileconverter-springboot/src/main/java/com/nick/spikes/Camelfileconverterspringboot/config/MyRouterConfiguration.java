package com.nick.spikes.Camelfileconverterspringboot.config;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRouterConfiguration {

    @Autowired
    private CamelContext camelContext;
}
