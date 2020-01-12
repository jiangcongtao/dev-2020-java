package com.nick.spikes.Camelfileconverterspringboot.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        String originalFileContent = (String) exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toUpperCase();
        exchange.getIn().setBody(upperCaseFileContent);
        System.out.println("Done File Processor");
    }
}