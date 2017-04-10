
public class Pirate {
  String name;
  boolean hasWoodenLeg;
  int gold;

  Pirate() {
    this("john doe", true, 0);
  }

  Pirate(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;
  }
}
