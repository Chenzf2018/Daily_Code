/*
Listing 10.7 TestStackOfIntegers.java
create a stack to store 10 integers 0, 1, 2, . . . , and 9, and display them in reverse order
 */

public class TestStackOfIntegers
{
    public static void main(String[] args)
    {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 10; i ++)
            stack.push(i);

        while (! stack.empty())
            System.out.print(stack.pop() + " ");
    }
}