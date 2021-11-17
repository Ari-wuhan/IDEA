package Algorithms_DataStructures.demo.Array;

public class Main {
    public static void main(String[] args) {
        Array <Integer>arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.addFirst(99);
        System.out.println(arr);

        arr.addLast(666);
        System.out.println(arr);

        arr.remove(6);
        System.out.println(arr);

        arr.removeElement(666);
        System.out.println(arr);

        System.out.println(arr.contains(666));
        System.out.println(arr.find(0));
    }
}
