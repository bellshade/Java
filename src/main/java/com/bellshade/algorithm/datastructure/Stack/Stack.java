package com.bellshade.algorithm.datastructure.Stack;

class Stack<T> {
    private T stack[];
    private int top;
    private int capacity;

    // Constructor for initialization
    @SuppressWarnings("unchecked")
    Stack(int size) {
        stack = (T[]) new Object[size];
        top = -1;
        capacity = size;
    }

    // fungsi untuk mengetahui ukuran dari stack
    public int size() {
        return top + 1;
    }

    // fungsi untuk pengecekan stack apakah sudah penuh
    public boolean isFull() {
        return top == capacity - 1;
    }

    // fungsi untuk pengecekan stack apakah kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // fungsi untuk mengetahui item paling atas dari sebuah stack
    public T peak() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.exit(-1);
        }
        return null;
    }

    // fungsi untuk menghapus item dari sebuah stack
    public void pop() {
        if (isFull()) {
            System.exit(-1);
        }
        System.out.println("Removing " + peak());
        top--;
    }

    // fungsi untuk memasukkan item ke dalam sebuah stack
    public void push(T item) {
        if (isFull()) {
            System.exit(-1);
        }
        System.out.println("Inserting " + item);
        stack[++top] = item;
    }

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>(5);
        myStack.push("Eat");
        myStack.push("Sleep");
        myStack.push("Repeat");

        System.out.println("Top element of myStack is " + myStack.peak());
        myStack.pop();
        System.out.println("Top element of myStack is " + myStack.peak());
        myStack.pop();
        System.out.println("myStack size : " + myStack.size());

        if (myStack.isEmpty()) {
            System.out.println("myStack is empty");
        } else {
            System.out.println("myStack is not empty");
        }
    }
}