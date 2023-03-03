package com.demo.patrones.patrones.services.factory;

import com.demo.patrones.patrones.patrones.creacionales.factorymethod.Factory;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.constant.TypeFactory;

public interface FactFactory {
  
  public Factory buildFactory(TypeFactory typeFactory);
}
