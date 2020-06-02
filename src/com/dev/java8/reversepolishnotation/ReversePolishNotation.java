package com.dev.java8.reversepolishnotation;

import java.util.Stack;

public class ReversePolishNotation {

    public double evaluate(String expr) {
        Stack<Double> stack = new Stack<>();

        if (!expr.equals("")) {
            for (String symbol : expr.split("\\s+")) {
                switch (symbol) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        stack.push(-stack.pop() + stack.pop());
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        double divisor = stack.pop();
                        stack.push(stack.pop() / divisor);
                        break;
                    case "^":
                        double exponent = stack.pop();
                        stack.push(Math.pow(stack.pop(), exponent));
                        break;
                    default:
                        stack.push(Double.parseDouble(symbol));
                        break;
                }
            }

            return stack.pop();
        } else return 0;
    }

}
