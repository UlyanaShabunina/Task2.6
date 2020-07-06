package ru.vsu.cs.course1;
public interface MyStack<T> {
    void push(T value);
    T peek() throws Exception;
    T pop() throws Exception;
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }
}
