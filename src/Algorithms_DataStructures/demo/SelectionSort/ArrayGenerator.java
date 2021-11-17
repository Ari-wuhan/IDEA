package Algorithms_DataStructures.demo.SelectionSort;
import java.util.Random;

public class ArrayGenerator{
    private ArrayGenerator(){}

    public static Integer[] genarateOrderedArray(int n){

        Integer [] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    //生成一个长度为n的随机数组，数组的范围是（0，bound)
    public static Integer [] genarateRamdomArray(int n,int bound){
        Integer [] arr = new Integer[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }
}

