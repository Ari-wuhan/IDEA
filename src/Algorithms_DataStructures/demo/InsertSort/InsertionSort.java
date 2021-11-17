package Algorithms_DataStructures.demo.InsertSort;

import Algorithms_DataStructures.demo.SelectionSort.ArrayGenerator;
import Algorithms_DataStructures.demo.SelectionSort.SortingHelp;

import java.util.Arrays;

public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        //arr[0..i)已经排序好，arr[i..n]还未排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                //从i到0,用j交换j-1（如果j<j-1对应的值)
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                } else break;

            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        //a[i]插入到合适到位置
        //通过赋值到方式来实现排序
        //arr[0..i)已经排序好,arr[i..n)未排序
        for (int i = 0; i < arr.length; i++) {
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    // 换个方法实现插入排序法，我们叫 sort2
    public static <E extends Comparable<E>> void sort3(E[] arr){

        for(int i = arr.length - 1; i >= 0; i --){

            // 将 arr[i] 插入到合适的位置
            E t = arr[i];
            int j;
            for(j = i; j + 1 < arr.length && t.compareTo(arr[j + 1]) > 0; j ++){
                arr[j] = arr[j + 1];
            }
            arr[j] = t;
        }
    }
    public static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
//        Integer [] arr = {11,2,33,4,1,99};
//            InsertionSort.sort(arr);
//        for (Integer e:arr) {
//            System.out.print(e+" ");
//        }
//        System.out.println();
//
//        int [] DateSize = {10000,100000};
//        for (int n:DateSize) {
//            Integer [] arr1 = ArrayGenerator.genarateRamdomArray(n,n);
//            Integer [] arr2 = Arrays.copyOf(arr1,arr1.length);
//            SortingHelp.sortTest("InsertionSort",arr1);
//            SortingHelp.sortTest("InsertionSort2",arr2);



        Integer [] arr3 = ArrayGenerator.genarateRamdomArray(10000,10000);
        SortingHelp.sortTest("InsertionSort3",arr3);

        //test
//        int[] DateSize = {10000, 100000};
//        for (int n : DateSize) {
//            System.out.println("Random Array");
//            Integer[] arr_1 = ArrayGenerator.genarateRamdomArray(n, n);
//            Integer[] arr_2 = Arrays.copyOf(arr_1, arr_1.length);
//
//            SortingHelp.sortTest("InsertionSort", arr_1);
//            SortingHelp.sortTest("SelectionSort", arr_2);
//            System.out.println();
//
//
//        for (int e : DateSize) {
//            System.out.println("Ordered Array");
//            Integer[] arr_3 = ArrayGenerator.genarateOrderedArray(e);
//            Integer[] arr_4 = Arrays.copyOf(arr_3, arr_3.length);
//
//            SortingHelp.sortTest("InsertionSort", arr_3);
//            SortingHelp.sortTest("SelectionSort", arr_4);
            }
}



