public class Main {

    public static void main(String[] args) {
        /*Employee employee1 = new Employee("Stanley Parable","white collar","s.parable@free.com",
                "+77777777777", 2000, 25);*/
        Employee[] arrEmployees = new Employee[5];
        arrEmployees[0] = new Employee("Stanley Parable", "white collar", "s.parable@free.com",
                "77777777777", 2000, 25);
        arrEmployees[1] = new Employee("John Smith", "manager", "j.smith@free.com", "77777777776",
                3500, 41);
        arrEmployees[2] = new Employee("Nancy Sinatra", "boss", "n.hot@free.com", "77777777773",
                10000, 30);
        arrEmployees[3] = new Employee("Big Lebowski", "dude", "dude@free.com", "00000000000", 500,
                45);
        for (int i = 0; i < arrEmployees.length; i++) {
            if (arrEmployees[i].getAge() > 40) {
                arrEmployees[i].info();
            }

        }


    }
}
////4. Создать массив из 5 сотрудников.
////Пример:
////Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
////persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
////persArray[1] = new Person(...);
////...
////persArray[4] = new Person(...);
////5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.