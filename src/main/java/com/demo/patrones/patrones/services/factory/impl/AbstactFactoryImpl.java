package com.demo.patrones.patrones.services.factory.impl;

import org.springframework.stereotype.Service;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.AbstractFactory;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.factory.Actions;
import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.factory.OfficeOne;
import com.demo.patrones.patrones.services.factory.AbstractFactoryService;
import com.demo.patrones.patrones.services.factory.constant.TypeAbstract;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AbstactFactoryImpl implements AbstractFactoryService{

  @Override
  public AbstractFactory buildAbstractFactory(TypeAbstract typeAbstract) {
    switch (typeAbstract) {
      case Office:
        return new OfficeOne();
      case Actions:
        return  new Actions();
      default:
        return null;
    }
    
  } 
}
