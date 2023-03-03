package com.demo.patrones.patrones.services.factory.impl;

import org.springframework.stereotype.Service;

import com.demo.patrones.patrones.patrones.creacionales.factorymethod.Factory;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.constant.TypeFactory;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.impl.FactoryTypeOne;
import com.demo.patrones.patrones.patrones.creacionales.factorymethod.impl.FactoryTypeTwo;
import com.demo.patrones.patrones.services.factory.FactFactory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FactFactoryImpl implements FactFactory{

  
  public Factory buildFactory(TypeFactory typeFactory) {
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
