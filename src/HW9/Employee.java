package HW9;

public class Employee extends Person{ // расширение класса Employee классом Person, можно наследовать только один класс

        private int salary;

        public Employee(String name, int age, char sex, int salary) {
                super(name, age, sex);
                this.salary = salary;
        }

        public int getSalary(){
                return salary;
        }

        public Boolean isSameName(Employee employee){
                return this.getName().equals(employee.getName());//!!не получается добавить without prefix
        }

}
