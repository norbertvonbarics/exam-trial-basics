import java.util.*;

import static com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap.get;

public class PirateCounter {
  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();
    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold

    System.out.println(pirateCounter(pirates));
  }

  public static ArrayList<String> pirateCounter(ArrayList pirates) {
    ArrayList<Pirate> newPiratesList = new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();
    for (int j = 0; j < pirates.size(); j++) {
      newPiratesList.add((Pirate) pirates.get(j));
    }
    for (int i = 0; i < pirates.size(); i++) {
      if ((newPiratesList.get(i).hasWoodenLeg) && newPiratesList.get(i).gold > 15)
        nameList.add(newPiratesList.get(i).name);
    }
    return nameList;
  }
}


