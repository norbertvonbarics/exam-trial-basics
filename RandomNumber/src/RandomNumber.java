
public class RandomNumber {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++){
      int randomNumber = (int) Math.ceil(Math.random()*1000);
      System.out.println(randomNumber);
    }
  }
}
