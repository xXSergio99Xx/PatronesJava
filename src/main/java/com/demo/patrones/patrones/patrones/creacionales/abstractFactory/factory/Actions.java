package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.factory;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.AbstractFactory;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.ActionsOffice;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.constant.TypeAbstractFactory;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific.Manage;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific.Payment;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific.Programming;

public class Actions implements AbstractFactory<ActionsOffice>{

  @Override
  public ActionsOffice create(TypeAbstractFactory type) {
    switch (type) {
      case RH:
        return new Payment();        
      case IT:
        return new Programming();
      case SST:
        return new Manage();
      default:
        return null;
    }
  }
  
}
