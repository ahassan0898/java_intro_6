package homeworks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("\n--------------TASK-1----------\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(1));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n--------------TASK-2----------\n");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n--------------TASK-3----------\n");

        ArrayList<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(-34);
        num.add(-56);
        num.add(0);
        num.add(89);
        num.add(100);

        System.out.println(num);
        Collections.sort(num); //ascending order
        System.out.println(num);

        System.out.println("\n--------------TASK-4----------\n");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n--------------TASK-5----------\n");

        ArrayList<String> characters = new ArrayList<>();
        characters.add("Spider Man");
        characters.add("Iron Man");
        characters.add("Black Panther");
        characters.add("DeadPool");
        characters.add("Captain America");
        System.out.println(characters);
        System.out.println(characters.contains("Wolverine"));

        System.out.println("\n--------------TASK-6----------\n");

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("\n--------------TASK-7----------\n");
        ArrayList<Character> char1 = new ArrayList<>();
        char1.add('A');
        char1.add('x');
        char1.add('$');
        char1.add('9');
        char1.add('*');
        char1.add('+');
        char1.add('F');
        char1.add('G');

        System.out.println(char1);

        for (Character character : char1) { //print each element seperately
            System.out.println(character);
        }

        System.out.println("\n--------------TASK-8----------\n");

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int mMcount = 0;
        int aAeEcount = 0;

        for (String object : objects) {
            if (object.startsWith("M") || object.startsWith("m")) mMcount++;
            if (!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e")) aAeEcount++;
        }
        System.out.println(mMcount);
        System.out.println(aAeEcount);

        System.out.println("\n--------------TASK-9----------\n");

        ArrayList<String> kitchen = new ArrayList<>();

        kitchen.add("Plate");
        kitchen.add("spoon");
        kitchen.add("fork");
        kitchen.add("Knife");
        kitchen.add("cup");
        kitchen.add("Mixer");
        System.out.println(kitchen);

        int uppercase = 0;
        int lowercase = 0;
        int havePp = 0;
        int startsendswithPp = 0;

        for (String s : kitchen) {
            if (Character.isUpperCase(s.charAt(0))) uppercase++;
            if (Character.isLowerCase(s.charAt(0))) lowercase++;
            if (s.contains("p") || s.contains("P")) havePp++;
            if (s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")) startsendswithPp++;
        }

        System.out.println("Elements starts with uppercase = " + uppercase);
        System.out.println("Elements starts with lowercase = " + lowercase);
        System.out.println("Elements having P or p = " + havePp);
        System.out.println("Elements starting or ending with P or p = " + startsendswithPp);

        System.out.println("\n--------------TASK-10----------\n");

        ArrayList<Integer> num2 = new ArrayList<>(); //3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        num2.add(3);
        num2.add(5);
        num2.add(7);
        num2.add(10);
        num2.add(0);
        num2.add(20);
        num2.add(17);
        num2.add(10);
        num2.add(23);
        num2.add(56);
        num2.add(78);

        System.out.println(num2);

        int div10 = 0;
        int even = 0;
        int odd = 0;
        int lessgreat = 0;

        for (Integer i : num2) {
           if (i % 10 == 0) div10++;
           if (i %2 == 0 && i >15) even++;
           if (i % 2 ==1 && i <20) odd++;
           if (i < 15 || i > 50) lessgreat++;
        }
        System.out.println("Elements that can be divided by 10 = " + div10);
        System.out.println("Elements that are even and greater than 15 = " + even);
        System.out.println("Elements that are odd and less than 20 = " + odd);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessgreat);
    }
}
