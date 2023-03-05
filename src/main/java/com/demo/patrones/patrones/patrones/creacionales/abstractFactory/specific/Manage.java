package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.ActionsOffice;

public class Manage implements ActionsOffice{

  @Override
  public String getActions() {
    return new String("Realizar cuidado de los demas");
  }

  @Override
  public float getPercentageAction() {
    return Float.valueOf(50);
  }
  
}
