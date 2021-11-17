package Algorithms_DataStructures.demo.LinseSearch;

/*线性搜索，返回索引值；若没有找到。返回-1*/

public class Linear_search{
    /*
    public static void main(String[] args){
        int[]   data={11,22,33,44,55};
        for (int i=0;i<=5;i++) {
            if(data[i]==44) System.out.println(i);
        }
    }
     */
    private Linear_search(){}
    public static  <E> int linear_search(E[] data,E target){
        for (int i = 0; i < data.length; i++) {
            //在Student类中重写equals()方法
            if(data[i].equals(target)){
                return i;}
        }
        return -1;

    }
    public static void main(String[] args) {
        //线性查找使用
        Integer[] data = {11, 22, 33, 44, 55, 66, 77, 88};
        int result1 = Linear_search.linear_search(data, 77);
        System.out.println(result1);
        //字符串查找
        int non = Linear_search.linear_search(data, 100);
        System.out.println(non);
        Student[] students = {new Student("Wuhan"),
                new Student("Mayun"),
                new Student("Leijun")};
        Student wuhan = new Student("wuhan");
        int res2 = Linear_search.linear_search(students,wuhan);
        System.out.println(res2);

        //测试算法性能--ArrayGenetor
        int [] DateSize = {1000000,10000000};
        for (int n : DateSize) {
            long startTime = System.nanoTime();
            Integer[] test = ArrayGenerator.genarateOrderedArray(n);
            for (int k = 0; k < 100; k++) {
                Linear_search.linear_search(test, n);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            //System.out.println(result3);
            System.out.println("n="+n+"运行100次，运行时间:"+time+"s");
        }

    }

}



