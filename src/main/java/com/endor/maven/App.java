package com.endor.maven;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        LOG.error("Generating Call Sites for Error");
        System.out.println( "Sample Ref 1" );
    }
}
