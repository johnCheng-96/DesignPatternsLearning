package org.example.behavioral.strategy;

/**
 * Strategy
 *
 * Allows one of a family of algorithms to be selected on-the-fly at runtime
 *
 * Use case:
 * Arrays.sort
 */
public class Runner {

  public static void main(String[] args) {
    NormalZombie normalZombie = new NormalZombie();
    normalZombie.display();
    normalZombie.move();
    normalZombie.attack();

    normalZombie.setAttackable(new HitAttack());
    normalZombie.attack();


    FlagZombie flagZombie = new FlagZombie();
    flagZombie.display();
    flagZombie.move();
    flagZombie.attack();
  }

}
