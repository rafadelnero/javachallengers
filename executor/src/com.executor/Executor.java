package com.executor;

import com.characters.Simpson;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Executor {

  public static void main(String... doYourBest) throws NoSuchMethodException,
          InvocationTargetException, IllegalAccessException {
    new Simpson().doh();

    Method method = Simpson.class.getDeclaredMethod("drinkBeer", String.class);
    method.setAccessible(true);
    method.invoke(new Simpson(), "Homer");
  }

}

// Rodrigo - D'oh! All beers were empty by Homer
// Rinaldo - D'oh! Some Exception
// Farhad  - D'oh! InvocationTargetException

