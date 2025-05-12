public class StackOfIntegers {
    private int[] elements;
    private int size;
    StackOfIntegers(){
        elements = new int[16];
    }
    StackOfIntegers(int capacity){
        if (capacity > 0) elements = new int[capacity];
        else elements = new int[16];
    }
    public boolean empty(){
        return size == 0;
    }
    public void push(int value){
        if (size >= elements.length){
            int[] newElements = new int[elements.length*2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = value;
    }
    public int pop(){
        if (empty()){
            throw new RuntimeException("Stack is empty");
        }
        return elements[--size];
    }
    public int peek(){
        if (empty()){
            throw new RuntimeException("Stack is empty");
        }
        return elements[size - 1];
    }

    public int getSize() {
        return size;
    }
}