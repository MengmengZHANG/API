package com.mzhang.api.log4jDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.foo.Bar;

public class ConfigurationFromFile {
  static Logger logger = Logger.getLogger(ConfigurationFromFile.class.getName());

  /**
   * @param args
   */
  public static void main(String[] args) {
    // BasicConfigurator.configure();
    // BasicConfigurator replaced with PropertyConfigurator.

    String configFileName = "src/main/resources/config3.properties";

    PropertyConfigurator.configure(configFileName);

    logger.info("Entering application.");
    Bar bar = new Bar();
    bar.doIt();
    logger.info("Exiting application.");
  }
}
