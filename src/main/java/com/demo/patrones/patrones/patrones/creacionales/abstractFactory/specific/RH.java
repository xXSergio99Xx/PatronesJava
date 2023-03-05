package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.Area;

public class RH implements Area{

  @Override
  public String getName() {
    return new String("Area de tecnología");
  }

  @Override
  public String getDescription() {
    return new String("Creación y soporte de aplicaciones");
  }
  
}
