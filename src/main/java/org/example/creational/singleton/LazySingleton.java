package org.example.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;


public class LazySingleton implements Serializable {

  // solve exception from readSolve(), assign constant UID
  private static final long serialVersionUID = -6829408843731345954L;

  // volatile: make sure object in heap is initialised before assigning to variable in stack to prevent error
  private volatile static LazySingleton lazySingleton;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {

    // Lazy, if instance already exist return the same object
    if (lazySingleton == null) {

      // thread safe, make sure instance does not new twice when two thread access at the same time
      synchronized (LazySingleton.class) {

        // instance does not new twice when two threads are waiting for the lock at the same time
        if (lazySingleton == null) {
          return new LazySingleton();

        }
      }
    }

    return lazySingleton;
  }

  // Make sure a same object when you get the same object from ObjectInputStream
  Object readResolve() throws ObjectStreamException {
    return getInstance();
  }

}
