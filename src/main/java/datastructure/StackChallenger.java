package datastructure;

public class StackChallenger<T> {
    private T [] data;
    private int stackPointer;

    StackChallenger() {
        data = (T[]) new Object[500];
        stackPointer = 0;
    }

    void push(T newElement) {
        data[stackPointer++] = newElement;
    }

    T pop() {
        if (stackPointer == 0) {
            throw new IllegalArgumentException("No elements on the stack");
        }

        return data[--stackPointer];
    }

    boolean contains(T element) {
        for(int i = 0; i < stackPointer; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }

        return false;
    }

    T access(T element) {
        while (stackPointer > 0) {
            T tmpElement = pop();
            if (element.equals(tmpElement)) {
                return tmpElement;
            }
        }

       throw new IllegalArgumentException("Could not find the element: " + element);
    }

    int size() {
        return stackPointer;
    }

}
