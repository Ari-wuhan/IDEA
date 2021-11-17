package Algorithms_DataStructures.demo.SelectionSort;

import java.net.Inet4Address;

public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        //arr[0..i)已排序好，arr[i..n)还未排序
        for (int i = 0; i < arr.length; i++) {
            //选择arr[i....n)中最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                //从i到n找到最小值
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;

            }
            swap(arr, i, minIndex);
        }
        /*
        public static <E extends Comparable<E>> void sort2(E []arr){
        //arr[0..i)未排序，arr[i..n)已经排序好排序
        for (int i = 0; i < arr.length; i++) {
            //选择arr[i....n)中最大值的索引
            int maxIndex = i;
            for (int j = i; j < arr.length ; j--) {
                //从i到n找到最小值
                if(arr[j].compareTo(arr[maxIndex]) > 0)
                    maxIndex = j;

            }
            swap(arr,i,minIndex);
        }
         */
    }

    public static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 18, 12, 21, 3};
        SelectionSort.sort(arr);
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();

        Student[] students = {new Student("Wuhan", 100),
                new Student("Mayun", 90),
                new Student("Leijun", 80)};
        SelectionSort.sort(students);
        for (Student e : students) {
            System.out.print(e + " ");
        }
        System.out.println();

        //test alogrithm
        int[] DataSize = {10000, 100000};
        for (int n : DataSize) {
            Integer[] arr_test = ArrayGenerator.genarateRamdomArray(n, n);

            SortingHelp.sortTest("SelectionSort", arr_test);
            System.out.println();
        }
    }
}
