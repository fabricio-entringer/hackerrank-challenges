package challenges;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaIfElse {
    public void execute(int N) {
        int [] arrayInt = IntStream.concat(IntStream.range(2,6), IntStream.range(21,101)).toArray();
        boolean isNEven = N % 2 == 0;
        boolean notWeird = isNEven && Arrays.stream(arrayInt).anyMatch(i -> (i==N));
        System.out.println(notWeird ? "Not Weird" : "Weird");
    }
}

/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.
An if-else statement has the following logical flow:

Task
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, n.

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
* */