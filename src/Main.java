import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> passInteger = new ArrayList<>();
        passInteger.add(1);
        passInteger.add(3);
        passInteger.add(2);
        passInteger.add(4);
        passInteger.add(3);
        passInteger.add(5);
        ArrayList<Character> passCharacter = new ArrayList<>();
        passCharacter.add('a');
        passCharacter.add('c');
        passCharacter.add('b');
        passCharacter.add('d');
        passCharacter.add('c');
        passCharacter.add('e');
        ArrayList<String> passString = new ArrayList<>();
        passString.add("apple");
        passString.add("cashew");
        passString.add("banana");
        passString.add("dates");
        passString.add("cashew");
        passString.add("emu-berry");

        System.out.println(Search.removeDuplicates(passInteger));
        System.out.println(Search.removeDuplicates(passCharacter));
        System.out.println(Search.removeDuplicates(passString));
    }
}
