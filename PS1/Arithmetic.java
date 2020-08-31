class Arithmetic {
    public static String[] split(String exp) {
        int arrLen = 1;
        int ndx = 0;

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == ' ') {
                arrLen++;
            }
        }

        String[] arr = new String[arrLen];

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == ' ') {
                ndx++;
            } else {
                if (arr[ndx] == null) {
                    arr[ndx] = "" + exp.charAt(i);
                } else {
                    arr[ndx] += exp.charAt(i);
                }
            }
        }
        return arr;
    }

    public static String[] infixToPostfix(String[] infix) {
        int postLen = infix.length;
        for (int i = 0; i < infix.length; i++) {
            if (infix[i].equals("(") || infix[i].equals(")")) {
                postLen--;
            }
        }
        String[] postfix = new String[postLen];
        ArrayStack<String> operatorStack = new ArrayStack<String>(infix.length);
        int offset = 0;
        for (int i = 0; i < infix.length; i++) {
            if (infix[i].equals("(")) {
                offset++;
            } else if (infix[i].equals("+") || infix[i].equals("-") || infix[i].equals("*") || infix[i].equals("/")) {
                operatorStack.push(infix[i]);
                offset++;
            } else if (infix[i].equals(")")) {
                postfix[i - offset] = operatorStack.pop();
            } else {
                postfix[i - offset] = infix[i];
            }
        }
        postfix[postLen - 1] = operatorStack.pop();
        return postfix;
    }

    public static double evaluatePostfix(String[] postfix) {
        ArrayStack<Double> values = new ArrayStack<Double>(postfix.length);
        for (int i = 0; i < postfix.length; i++) {
            if (!(postfix[i].equals("+") || postfix[i].equals("-") || postfix[i].equals("*")
                    || postfix[i].equals("/"))) {
                values.push(Double.parseDouble(postfix[i]));
            } else {
                if (postfix[i].equals("+")) {
                    values.push(values.pop() + values.pop());
                } else if (postfix[i].equals("-")) {
                    values.push(-values.pop() + values.pop());
                } else if (postfix[i].equals("*")) {
                    values.push(values.pop() * values.pop());
                } else {
                    values.push(1 / values.pop() * values.pop());
                }
            }
        }
        return values.pop();
    }

    public static double evaluate(String exp) {
        String temp = "";
        double val1;
        double val2;
        ArrayStack<Double> operandStack = new ArrayStack<Double>(exp.length());
        ArrayStack<String> operatorStack = new ArrayStack<String>(exp.length());
        for (int i = 0; i < exp.length() + 1; i++) {
            if (i < exp.length() && exp.charAt(i) != ' ') {
                if (temp.isEmpty()) {
                    temp = "" + exp.charAt(i);
                } else {
                    temp += exp.charAt(i);
                }
            } else {
                if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                    operatorStack.push(temp);
                } else if (temp.equals(")")) {
                    val1 = operandStack.pop();
                    val2 = operandStack.pop();
                    temp = operatorStack.pop();

                    if (temp.equals("+")) {
                        operandStack.push(val1 + val2);
                    } else if (temp.equals("-")) {
                        operandStack.push(val2 - val1);
                    } else if (temp.equals("*")) {
                        operandStack.push(val1 * val2);
                    } else {
                        operandStack.push(val2 / val1);
                    }
                } else if (!temp.equals("(")) {
                    operandStack.push(Double.parseDouble(temp));
                }
                temp = "";
            }
        }
        temp = operatorStack.pop();
        if (temp.equals("+")) {
            operandStack.push(operandStack.pop() + operandStack.pop());
        } else if (temp.equals("-")) {
            operandStack.push(-operandStack.pop() + operandStack.pop());
        } else if (temp.equals("*")) {
            operandStack.push(operandStack.pop() * operandStack.pop());
        } else {
            operandStack.push(1 / operandStack.pop() * operandStack.pop());
        }
        return operandStack.pop();
    }
}