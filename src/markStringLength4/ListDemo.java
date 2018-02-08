package markStringLength4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();

        addList(listString);
        markLength4(listString);
        System.out.println(listString);
    }

    private static void addList(List<String> listString) {
        listString.add("this");
        listString.add("is");
        listString.add("lots");
        listString.add("of");
        listString.add("fun");
        listString.add("for");
        listString.add("every");
        listString.add("java");
        listString.add("programmer");
    }

    private static void markLength4(List<String> listString) {
        String stringMark = "****";
        List<String> newList = new ArrayList<>();

        for (String element : listString) {
            if (element.length() == 4) {
                newList.add(stringMark);
                newList.add(element);
            } else {
                newList.add(element);
            }
        }

        listString.clear();
        listString.addAll(newList);
    }
}
