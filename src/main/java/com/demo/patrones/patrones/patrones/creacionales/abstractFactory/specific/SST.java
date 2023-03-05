package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.Area;

public class SST implements Area {

  @Override
  public String getName() {
    return new String("Seguridad y salud en el trabajo");
  }

  @Override
  public String getDescription() {
    return new String("Joder por las postura");
  }
  
}
