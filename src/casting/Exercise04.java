package casting;

public class Exercise04 {
    public static void main(String[] args) {


        String areWeOnline = "true";
        String isEveryoneJoined = "false";

        System.out.println(Boolean.parseBoolean(areWeOnline) & Boolean.parseBoolean(isEveryoneJoined));



    }
}
