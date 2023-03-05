package com.demo.patrones.patrones.patrones.creacionales.abstractFactory;

import com.demo.patrones.patrones.patrones.creacionales.abstractFactory.constant.TypeAbstractFactory;

public interface AbstractFactory<T> {
  T create(TypeAbstractFactory type);
}
