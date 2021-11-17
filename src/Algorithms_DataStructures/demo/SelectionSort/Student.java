package Algorithms_DataStructures.demo.SelectionSort;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name ,int score){
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Student another){
//        if(this.score < another.score)
//            return -1;
//        else if(this.score == another.score)
//            return 0;
//        return 1;
        //从小到大排序
//        return this.score - another.score;
        //从大到小
        return another.score - another.score;
    }
    @Override
    public String toString(){
        return String.format("Student(name:%s,score:%d)",name,score);
    }
    @Override
    public boolean equals(Object student){
        //先判断
        if(this == student)
            return true;
        if (student == null)
            return false;
        if(student.getClass() != this.getClass())
            return false;

        Student another = (Student)student;
        return this.name.toLowerCase().equals(another.name.toLowerCase());
    }
}


