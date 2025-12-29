import java.util.EmptyStackException;
import java.util.Stack;

public class StackMethod {
    StackMethod(){
        /*
            stack = LIFO data structure, Last In First Out
            stores objects into a sort of "vertical tower"
            push() to add to the top
            pop() to remove from the top
        */
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty());
        /* stack data insertion */
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        /* Deletes FFVII */
        stack.pop();
        System.out.println(stack);
        /* Deletes Borderlands */
        stack.pop();
        System.out.println(stack);
        /* Deletes DOOM */
        stack.pop();
        System.out.println(stack);
        /* Deletes Skyrim */
        stack.pop();
        System.out.println(stack);
        /* Deletes Minecraft */
        stack.pop();
        System.out.println(stack);
        /* The stack is empty and it returns an exception */
        try{
            stack.pop();
            System.out.println(stack);
        }
        catch(EmptyStackException ESE){
            System.out.println("The stack is Empty");
        }
        System.out.println();
        /* calls void main2 */
        StackMethod2();
        StackMethod3();
        StackMethod4();
        StackMethod5();
    }

    public static void StackMethod2(){
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty());
        /* stack data insertion */
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        /* assigns myFavGame to the last item in the stack */
        String myFavGame = stack.pop();

        System.out.println(stack);
        System.out.println(myFavGame + " the last item in the stack");
        System.out.println();
    }
    public static void StackMethod3(){
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty());
        /* stack data insertion */
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        /* prints the last item in the stack */
        System.out.println(stack.peek() + " the last item in the stack");

        System.out.println(stack);
        System.out.println();
    }
    public static void StackMethod4(){
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty());
        /* stack data insertion */
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        /* prints the position of a specific item in the stack */
        System.out.println(stack.search("FFVII"));
        System.out.println(stack.search("DOOM"));
        /* if the items is not in the stack, it returns -1 */
        System.out.println(stack.search("Doom"));
        System.out.println();
    }
    public static void StackMethod5(){
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty());
        /* stack data insertion */
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        for(int i=0;i<1000000000;i++){
            /* there will be a memory error (exception OutOfMemoryError) */
            stack.push("Fallout 76");
        }
        System.out.println();
    }
}

/*
    uses of stacks:
    1. undo/redo features in text editors
    2. moving back/forward through browser history
    3. backtracking algorithms (maze, file directories)
    4. calling functions (call stack)
*/