package com.demo.patrones.patrones.patrones.creacionales.abstractFactory.factory;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.AbstractFactory;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.Area;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.constant.TypeAbstractFactory;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific.IT;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific.RH;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.specific.SST;

public class OfficeOne implements AbstractFactory<Area> {

  @Override
  public Area create(TypeAbstractFactory type) {
    switch (type) {
      case RH:
        return new RH();        
      case IT:
        return new IT();
      case SST:
        return new SST();
      default:
        return null;
    }
  }
  
}
