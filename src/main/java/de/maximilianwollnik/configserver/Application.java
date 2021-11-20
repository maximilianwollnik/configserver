/*
 * Copyright (c) 2015, Maximilian Wollnik, All rights reserved.
 */
package de.maximilianwollnik.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Configserver for my homepage
 * @author maximilian
 * @version 1.0
 * @since 0.1.0
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

  /**
   * The main method.
   * @param args the arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
