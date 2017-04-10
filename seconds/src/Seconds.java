import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    List<Integer> rawList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    System.out.println(rawList);
    System.out.println(everySecondElement(rawList));
  }

  public static List<Integer> everySecondElement(List<Integer> rawList) {
    List<Integer> everySecondElementList = new ArrayList<>();
    for (int i = 1; i < rawList.size(); i += 2) {
      everySecondElementList.add(rawList.get(i));
    }
    return everySecondElementList;
  }
}
