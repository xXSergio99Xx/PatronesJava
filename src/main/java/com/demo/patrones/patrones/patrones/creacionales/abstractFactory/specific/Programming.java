package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.ActionsOffice;

public class Programming implements ActionsOffice{

  @Override
  public String getActions() {
   return new String("Creación de estructura de programación");
  }

  @Override
  public float getPercentageAction() {
    return Float.valueOf(20);
  }
  
}
