package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.ActionsOffice;

public class Payment implements ActionsOffice{

  @Override
  public String getActions() {
    return new String("Realizar pago");
  }

  @Override
  public float getPercentageAction() {
    return Float.valueOf(10);
  }
  
}
