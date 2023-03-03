package com.demo.patrones.patrones.patrones.creacionales.factorymethod.impl;

import com.demo.patrones.patrones.patrones.creacionales.factorymethod.Factory;

public class FactoryTypeOne implements Factory {

  @Override
  public void doFactory() {
    System.out.println("El primer tipo para el ejemplo de patron de diseño Factory");
  }
  
}
