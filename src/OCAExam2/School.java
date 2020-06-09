package OCAExam2;

class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
}
public class School {
    public static void main(String[] args) {
        Student[] students= new Student[3];

        students[1]=new Student("Donald");

        students[2]=new Student("Ron");

        for(Student s: students){

            System.out.println(s);
        }

        int []
arr={1,2,3,4};
        int i=0;

        do{
            System.out.println(arr[i]);
            i++;
        }while(i<arr.length-1);
    }
}
