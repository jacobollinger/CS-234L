import java.util.Arrays;

class Test {
    private static void runTest(String exp) {
        System.out.println("input: " + exp);

        String[] infix = Arithmetic.split(exp);
        System.out.println("infix array: " + Arrays.toString(infix));

        String[] postfix = Arithmetic.infixToPostfix(infix);
        System.out.println("postfix array: " + Arrays.toString(postfix));

        double value1 = Arithmetic.evaluatePostfix(postfix);
        System.out.println("resulting value from postfix array: " + String.format("%f", value1));

        double value2 = Arithmetic.evaluate(exp);
        System.out.println("resulting value directly from input: " + String.format("%f", value2));
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("example 1");
        String exp1 = "-4.1 + 8";
        runTest(exp1);

        System.out.println();
        System.out.println("example 2");
        String exp2 = "( 2.2 - 7 ) / 5";
        runTest(exp2);

        System.out.println();
        System.out.println("example 3");
        String exp3 = "( 27 / 3 ) + ( 2 * -4 )";
        runTest(exp3);

        System.out.println();
        System.out.println("example 4");
        String exp4 = "4 / ( ( 3 * ( 5.5 * 2 ) ) + ( ( 27 / 3 ) + ( 2 * -4 ) ) )";
        runTest(exp4);
    }
}

// Expected output

// example 1
// input: -4.1 + 8
// infix array: [-4.1, +, 8]
// postfix array: [-4.1, 8, +]
// resulting value from postfix array: 3.900000
// resulting value directly from input: 3.900000

// example 2
// input: ( 2.2 - 7 ) / 5
// infix array: [(, 2.2, -, 7, ), /, 5]
// postfix array: [2.2, 7, -, 5, /]
// resulting value from postfix array: -0.960000
// resulting value directly from input: -0.960000

// example 3
// input: ( 27 / 3 ) + ( 2 * -4 )
// infix array: [(, 27, /, 3, ), +, (, 2, *, -4, )]
// postfix array: [27, 3, /, 2, -4, *, +]
// resulting value from postfix array: 1.000000
// resulting value directly from input: 1.000000

// example 4
// input: 4 / ( ( 3 * ( 5.5 * 2 ) ) + ( ( 27 / 3 ) + ( 2 * -4 ) ) )
// infix array: [4, /, (, (, 3, *, (, 5.5, *, 2, ), ), +, (, (, 27, /, 3, ), +,
// (, 2, *, -4, ), ), )]
// postfix array: [4, 3, 5.5, 2, *, *, 27, 3, /, 2, -4, *, +, +, /]
// resulting value from postfix array: 0.117647
// resulting value directly from input: 0.117647