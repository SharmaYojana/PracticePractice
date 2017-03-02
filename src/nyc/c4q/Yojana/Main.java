package nyc.c4q.Yojana;

import sun.tools.asm.SwitchData;

import java.util.*;

//Java Bootcamp-Data Sturctures- Problem-Sorting Sentences//

public class Main {

    public static void main(String[] args) {
        sortingSentence("I have a dog .");
        int[] array1 = {1, 1, 3};
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(3);
        System.out.println(clumps(array));
        podHashMap();
        canRentACar(new HashMap<String, Integer>());
    }

    public static void sortingSentence(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : words) {
            arrayList.add(string);
        }
        System.out.println(arrayList.toString());
    }

    //Java Bootcamp-Data Sturctures- Problem-how many clumps//

    public static int clumps(ArrayList<Integer> list) {
        int seriesCounter = 0, trueTracker = 0;
        boolean indexRepeat = true;


        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                indexRepeat = true;
                trueTracker++;
            } else
                indexRepeat = false;
            if (indexRepeat && trueTracker == 1)
                seriesCounter++;
            else if (!indexRepeat)
                trueTracker = 0;
            else
                indexRepeat = true;
        }
        return seriesCounter;
    }

    //Conditionals-3. Alarm Clock//
//    public static String alarmClock(int day, boolean vacation) {
//        int sun = 0, mon = 1, tue = 2, wed = 3, thu = 4, fri = 5, sat = 6;
//        if (!vacation)
//            return "Off";
//        switch (day) {
//            case (0):
//                return "10:00";
//            case (1):
//                return "7:00";
//
//
//            return "";
//        }
//    }

    //3. Pod HashMap
    //    Create a HashMap that maps the names of all the Access Coders in your Pod to their age.
//    Use a loop to print each key-value pair of the HashMap.

    public static void podHashMap() {
        Map<String, Integer> podMap = new HashMap<>();
        podMap.put("Josiel", 35);
        podMap.put("Max", 55);
        podMap.put("Yojana", 25);
        podMap.put("Eddie", 27);

        for (String key : podMap.keySet()) {

            System.out.println(key + " " + podMap.get(key));

        }
    }

//    Data Structures - 4. canRentACar
// Write a method called canRentACar that takes the Pod HashMap as a parameter and returns whether or not the Pod can
// rent a car. If one or more students is over 25, it should return true. If no one in the Pod is over 25,
// it should return false.

    public static boolean canRentACar(HashMap<String, Integer> map) {
        for (String key : map.keySet()) {
            if (map.get(key) > 25) {
                return true;
            }
        }
        return false;

    }

//     Loops - 5. Digits
//    Use nested for loops to generate a list of all the positive two digit numbers. Display the numbers,
//    and the sums of their digits.


}
