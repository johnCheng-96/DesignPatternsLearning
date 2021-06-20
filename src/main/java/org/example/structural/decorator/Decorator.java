package org.example.structural.decorator;

/**
 * Decorator
 *
 * add features without modifying the original component
 * Open-closed principle
 *
 * Use cases:
 * add new feature to an existing component
 *
 * Pros:
 * 1. extensible
 * 2. different combination can have different features
 * 3. Open-closed
 *
 * Use cases in source code:
 * 1. Servlet API
 * 2. HttpServletRequestWrapper
 * 3. HttpServletResponseWrapper
 *
 */
abstract class Decorator implements Camera{
  Camera camera;

  public Decorator(Camera camera) {
    this.camera = camera;
  }
}
