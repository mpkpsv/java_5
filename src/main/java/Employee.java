public class Employee {
    private String full_name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String full_name, String position, String email, String phone_number, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Информация о сотруднике: " + full_name + " " + position + " " + email + " " + phone_number +
                " " + salary + " " + age);

    }

}


//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

