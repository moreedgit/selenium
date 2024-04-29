package browser_start;

import java.util.Arrays;
import java.util.List;

public class StringConcept {
    public static void main(String[] args) {

        String s = "hello";


        StringBuilder sb = new StringBuilder("Testing");
        sb.append(" Automation");
        System.out.println(sb);

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(num.get(2));


    }
}