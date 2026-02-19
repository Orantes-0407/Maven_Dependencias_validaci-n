package stackHandler.handler;

import umg.edu.gt.data_structure.stack.impl.SymbolValidator;
import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class Main {

    public static void main(String[] args) {

        SymbolValidator validator = new SymbolValidator();

        // 1) Si el usuario pasa una expresión por consola, validarla
        if (args.length > 0) {
            String expr = args[0];
            boolean ok = validator.isBalanced(expr);

            System.out.println("Expression: " + expr);
            System.out.println("Valid: " + ok);
            return;
        }

       
        String validExpr = "(a+b) * [c-d]";
        String invalidExpr = "([)]";

        System.out.println("Expression: " + validExpr);
        System.out.println("Valid: " + validator.isBalanced(validExpr));   // true

        System.out.println("Expression: " + invalidExpr);
        System.out.println("Valid: " + validator.isBalanced(invalidExpr)); // false

      
        StackLinked stack = new StackLinked();
        stack.initStack('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Count/Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Empty?: " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Empty?: " + stack.isEmpty());
    }
}
