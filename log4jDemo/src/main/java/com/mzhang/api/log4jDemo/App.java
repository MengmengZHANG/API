package com.mzhang.api.log4jDemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    // get a logger instance named "com.foo"
    Logger logger = Logger.getLogger("com.mzhang.api.log4jDemo");

    // Set up a simple configuration that logs on the console.
    BasicConfigurator.configure();

    // Now set its level. Normally you do not need to set the
    // level of a logger programmatically. This is usually done
    // in configuration files.
    logger.setLevel(Level.INFO);

    Logger barlogger = Logger.getLogger("com.mzhang.api.log4jDemo.App");

    // This request is enabled, because WARN >= INFO.
    logger.warn("Low fuel level.");

    // This request is disabled, because DEBUG < INFO.
    logger.debug("Starting search for nearest gas station.");

    // The logger instance barlogger, named "com.foo.Bar",
    // will inherit its level from the logger named
    // "com.foo" Thus, the following request is enabled
    // because INFO >= INFO.
    barlogger.info("Located nearest gas station.");

    // This request is disabled, because DEBUG < INFO.
    barlogger.debug("Exiting gas station search");
    }
}
