import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> pass = new ArrayList<>();
        pass.add(1);
        pass.add(3);
        pass.add(2);
        pass.add(4);
        pass.add(3);
        pass.add(5);
        System.out.println(Search.removeDuplicates(pass));
    }
}
