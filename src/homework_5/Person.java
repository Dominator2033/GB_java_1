package homework_5;

public class Person {
        private  String FIO;
        private  String position;
        private  String Email;
        private  String cellphone;
        private  int salary;
        private  int age;

        public String getFIO() {
            return FIO;
        }

        public String getPosition() {
            return position;
        }

        public String getEmail() {
            return Email;
        }

        public String getCellphone() {
            return cellphone;
        }

        public int getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }

        public Person(String _FIO, String position, String email, String cellphone, int salary, int age) {
            this.FIO = _FIO;
            this.position = position;
            this.Email = email;
            this.cellphone = cellphone;
            this.salary = salary;
            this.age = age;
        }

        public void getInfo() {
            System.out.println("ФИО: " + FIO + " Должность: " + position + " Email: " + Email +
                    " Номер телефона: " + cellphone + " Зарплата: " + salary + " Возраст: " + age);
        }

}
