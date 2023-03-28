package bt1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Arrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String inputStr = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<Character>();
        for (int i = 0; i < inputStr.length(); i++) {
            LinkedList<Character> list = new LinkedList<Character>();
            list.add(inputStr.charAt(i));
            for (int j = i + 1; j < inputStr.length(); j++) {
                if (inputStr.charAt(j) >list.getLast()) {
                    list.add(inputStr.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
