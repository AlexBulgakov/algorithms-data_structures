package Home_Lection3;

import Home_Lection3.stack.Stack;
import Home_Lection3.stack.StackImpl;

import java.util.Arrays;
import java.util.Iterator;

public class ConverselyTextRead {

    private static final String TEXT_TO_READ = """
            When your eye receives light, it sends messages to your mind.
            """;

    public static void main(String[] args) {
        new ConverselyTextRead().converselyText(TEXT_TO_READ);
    }

    public void converselyText(String text) {
        Stack<Character> stack = new StackImpl<Character>(text.length());
        for (char c : text.toCharArray()) {
            stack.push(c);
            System.out.print(c);
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.pop());
        }

    }
}
