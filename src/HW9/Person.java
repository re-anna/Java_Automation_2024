package HW9;

public class Person {

    protected String name;
    protected int age;
    protected char sex;

    //конструктор
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String nameWithoutPrefix(){
        return name;
    }

    public String getName() {
        if (sex == 'M') {
            return "Mr" + name;
        } else if (sex == 'F'){
            return "Mrs" + name;
        }else {
            return name;
        }
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }


}
