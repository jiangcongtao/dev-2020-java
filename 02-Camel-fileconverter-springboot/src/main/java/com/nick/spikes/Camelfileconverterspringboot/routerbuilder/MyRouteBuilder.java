package com.nick.spikes.Camelfileconverterspringboot.routerbuilder;

import com.nick.spikes.Camelfileconverterspringboot.processor.FileProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.language.SimpleExpression;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file://temp/files")
                .process(new FileProcessor())
                .to("file://temp/output1")
                .transform(new SimpleExpression("${body.toLowerCase()}"))
                .to("file://temp/output2");
    }
}
