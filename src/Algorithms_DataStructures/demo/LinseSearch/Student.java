package Algorithms_DataStructures.demo.LinseSearch;

public class Student {
    public String name;

    public Student(String name){
        this.name = name;
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


