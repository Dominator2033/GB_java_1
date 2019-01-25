package homework_5;

public class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Иванов Иван", "Программист", "123@123.ru", "84991234567", 40000, 26);
        persArray[2] = new Person("Петров Петя", "Программист", "1234@123.ru", "84991234567", 50000, 45);
        persArray[3] = new Person("Сидоров Илья", "Программист", "12345@123.ru", "84991234567", 60000, 56);
        persArray[4] = new Person("Петрухин Сергей", "Программист", "123456@123.ru", "84991234567", 70000, 27);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40) {
                persArray[i].getInfo();
            }
        }
    }
}


