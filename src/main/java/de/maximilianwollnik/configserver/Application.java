/*
 * Copyright (c) 2015, Maximilian Wollnik, All rights reserved.
 */
package de.maximilianwollnik.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Configserver for my homepage
 * @author maximilian
 * @version 1.0
 * @since 0.1.0
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class Application {

  /**
   * The main method.
   * @param args the arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
