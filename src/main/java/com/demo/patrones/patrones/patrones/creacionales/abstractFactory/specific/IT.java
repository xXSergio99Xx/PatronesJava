package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.Area;

public class IT implements Area {

  @Override
  public String getName() {
   return new String("Area de recursos humanos");
  }

  @Override
  public String getDescription() {
    return new String("Contratar gente y pagar");
  }
  
}
