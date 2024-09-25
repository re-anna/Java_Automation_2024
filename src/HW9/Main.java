package HW9;

public class Main {

    public static void main(String[] args){

        Employee[] employees = {
                new Employee("Sergey",33, 'M', 100000),
                new Employee("Anna", 30, 'F', 100000)
        };
        System.out.println(SalaryUtils.getSum(employees));

        //создали абстрактный класс без обязательных параметров
        //в классе main можем создать объекты

       // Person person1 = new Person();//создаем объект
        //person1.name = "Sergey";//задаем имя
        //person1.age = 45;// задаем возраст

        //объект employee с классом person
        //Employee employee1 = new Employee();
        //employee1.name = "Ivan";
        //employee1.sex = 'M';
        //employee1.age = 19;
        //employee1.salary = 10000;

        //employee1.setAge(55);





    }
}