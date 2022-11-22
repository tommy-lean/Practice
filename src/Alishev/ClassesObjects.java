package Alishev;

public class ClassesObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 50);

        Person person2 = new Person();
        String s1 = "Вова";
        person2.setNameAndAge(s1, 20);

        person1.speak();


    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String userName, int age){
        name = userName;
    }


    int calculateYears(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        for(int i = 0; i < 3; i++) {
            System.out.println("Меня зовут: " + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет");
    }
}
