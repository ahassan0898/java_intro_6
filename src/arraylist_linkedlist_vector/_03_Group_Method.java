package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_Group_Method {
    public static void main(String[] args) {

        ArrayList<String> group1Members= new ArrayList<>();
        group1Members.add("Belal");
        group1Members.add("Assem");
        group1Members.add("Gurkan");
        group1Members.add("Dima");

        ArrayList<String> group2Members = new ArrayList<>();
        group2Members.add("Adam");
        group2Members.add("Melek");
        group2Members.add("Cihan");

        ArrayList<String> group3Members = new ArrayList<>();
        group3Members.add("Yousef");
        group3Members.add("Sandina");


        System.out.println("Group 1 members  = " + group1Members);
        System.out.println("Group 2 members  = " + group2Members);
        System.out.println("Group 3 members  = " + group3Members);

        /*
        Create a new list called as allMembers and store all the group numbers in that
        Then print it

        Expected:
        [Adam, Melek, Cihan, Belal, Assem, Gurkan, Dima, Yousef, Sandina]
         */

        System.out.println("\n-----------addAll() methods----------------\n"); //This method adds a collection to a bigger collection
        ArrayList<String> allMembers = new ArrayList<>();
        allMembers.addAll(group2Members);
        allMembers.addAll(group1Members);
        allMembers.addAll(group3Members);
        System.out.println("All members = " + allMembers);

        /*
        Remove group1Members allMembers list
        Then print it again

        Expected:
       [Adam, Melek, Cihan, Yousef, Sandina]
         */

        allMembers.removeAll(group1Members);
        System.out.println(allMembers);

 /*
        Melek, Cihan, Belal, Gurkan, Dima, Sandina

        Check if the collection contains Cihan, Dima and Sandina -> true
        Check if the collection contains Jazzy, Gurkan, Belal, Melek -> false
         */

        System.out.println("\n-----containsAll()-------\n");

        ArrayList<String> check1 = new ArrayList<>(Arrays.asList("Cihan", "Dima", "Sandina"));
        ArrayList<String> check2 = new ArrayList<>(Arrays.asList("Jazzy", "Gurkan", "Belal", "Melek"));

        System.out.println(check1);
        System.out.println(check2);

        System.out.println(allMembers.containsAll(check1)); // true
        System.out.println(allMembers.containsAll(check2)); // false



        /*
        Keep only Cihan and Gurkan but remove the rest

        Expected:
        [Cihan, Gurkan]
         */

        System.out.println("\n-----------retainAll()--------\n");

        ArrayList<String> keepList = new ArrayList<>(Arrays.asList("Cihan", "Gurkan"));

        allMembers.retainAll(keepList); //keep the keepList but remove the rest
        System.out.println(allMembers); // [Cihan, Gurkan]
    }
}
