
public class Cuboid {
  int sideA;
  int sideB;
  int sideC;

  public Cuboid() {
    this(1, 1, 1);
  }

  public Cuboid(int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  static int getSurface(int sideA, int sideB, int sideC) {
    int surface = 2 * (sideA * sideB) + 2 * (sideA * sideC) + 2 * (sideB * sideC);
    return surface;
  }

  static int getVolume(int sideA, int sideB, int sideC) {
    int volume = sideA * sideB * sideC;
    return volume;
  }
}
