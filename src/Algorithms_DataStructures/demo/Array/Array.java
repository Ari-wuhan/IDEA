package Algorithms_DataStructures.demo.Array;

public class Array <E>{
    private E [] data;
    private int size;

    //构造函数，传入数组到容量capacity构造数组Array
    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }
    //无参构造函数，默认数组到容量为10
    public Array(){
        this(10);
    }
    //获取数组长度
    public int getSize(){
        return size;
    }
    //获取数组容量
    public int getCapacity(){
        return data.length;
    }
    //判断数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //向数组末尾添加元素
    public void addLast(E e){
//        if (size == data.length)
//            throw new IllegalArgumentException("AddLast failed,data is full.");
//        data[size] = e;
//        size ++;
        add(size,e);
    }
    //向数组首部添加元素
    public void addFirst(E e){
        add(0,e);
    }
    //向指定位置添加元素
    public void add(int index,E e){
        if (size == data.length)
            throw new IllegalArgumentException("AddLast failed,data is full.");
        if (index <0 ||index >size)
            throw new IllegalArgumentException("Add failed,required index >=0 && index <=size");
        for (int i = size - 1; i >=index ; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }
    //获取index索引处的位置
    public E get(int index){
        if (index < 0 ||index >= size )
            throw new IllegalArgumentException("Get failed,index is illegal.");
        return data[index];
    }
    //设置index索引处的元素
    public void set(int index,E e ){
        if (index < 0 ||index >= size )
            throw new IllegalArgumentException("Set failed,index is illegal.");
        data[index] = e;
    }
    //查询是否有某个元素
    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }
    //查询元素在数组内的索引
    public int find(E e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }
    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++)
            data[i - 1] = data[i];
        size --;
        data[size] = null;
        return ret;
    }
    //删除首元素
    public void removeFirst(){
        remove(0);
    }
    //删除最后一个元素
    public void removeLast(){
        remove(size -1);
    }
    public void removeElement(E e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }
    @Override
    public String toString(){
        StringBuffer re = new StringBuffer();
        re.append(String.format("Array data size = %d,data capacity = %d \n",size,data.length));
        re.append("[");
        for (int i = 0; i < size; i++) {
            re.append(data[i]);
            if (i != data.length)
                re.append(", ");
        }
        re.append("]");
        return re.toString();
    }

}
