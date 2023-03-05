package com.demo.patrones.patrones.services.factory;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.AbstractFactory;
import com.demo.patrones.patrones.services.factory.constant.TypeAbstract;

public interface AbstractFactoryService {
  public AbstractFactory buildAbstractFactory(TypeAbstract typeAbstract);
}
