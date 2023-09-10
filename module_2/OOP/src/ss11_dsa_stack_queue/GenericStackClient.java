package ss11_dsa_stack_queue;

public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Kich thuoc cua Stack sau khi push" + stack.size());
        System.out.println("Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("Kich thuoc sau khi su dung pop"+ stack.size());
    }

    private static void stackOfInteger(){

    }


}
