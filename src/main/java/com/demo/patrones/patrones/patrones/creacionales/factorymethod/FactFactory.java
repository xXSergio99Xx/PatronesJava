package com.demo.patrones.patrones.patrones.creacionales.factorymethod;

import com.demo.patrones.patrones.patrones.creacionales.factorymethod.constant.TypeFactory;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.impl.FactoryTypeOne;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.impl.FactoryTypeTwo;

//Esta es la que se encarga de devolver el tipo de clase
public class FactFactory {
  
  // Se crea la función el cual devolvera el tipo de factory a implementar
  public Factory buildFactory(TypeFactory typeFactory){
    switch (typeFactory) {
      case TypeFactoryOne:
        return new FactoryTypeOne();
      case TypeFactoryTwo:
        return new FactoryTypeTwo();
      default:
        return new FactoryTypeOne();
    }
  }
}
