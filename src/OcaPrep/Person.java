package OcaPrep;

public class Person {


    String name = "t";
    int age = 25;

    public Person(String name) {

        setName(name);
    }

    public Person(String name, int age) {
      // Person(name);

        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return name + " " + age + " ";
    }


    public static void main(String[] args) {

        Person p1 = new Person("jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());

        System.out.println(p2.show());

    }

}