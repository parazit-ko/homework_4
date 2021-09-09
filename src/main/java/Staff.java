public class Staff {

    String name;
    String position;
    String mail;
    String contact;
    int salary;
    int age;

    void personalInfo (){
        System.out.printf("Контактные данные сотрудника",name, mail,contact);
    }

    public Staff(String name, String position, String mail, String contact, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.contact = contact;
        this.salary = salary;
        this.age = age;
    }
    Staff[] staff = new Staff [5];

    {
        new Staff("Иванов В.В.", "Инженер", "ivanov@mail.ru","+79129876543", 60500,41);
        new Staff("Петров В.В.", "Инженер", "petrov@mail.ru","+79129876593", 50500,40);
        new Staff("Сидоров В.В.", "Мастер", "sidorov@mail.ru","+79129874698", 17500,40);
        new Staff("Арбузов В.В.", "Мастер", "arbuzov@mail.ru","+79159874534", 17900,35);
        new Staff("Абрикосов В.В.", "Сменщик", "abrikosov@mail.ru","+79606600606", 16000,38);


//    }
//    for (int i = 0; i<Staff.length; i++){
//        System.out.println(Staff.age <=40 );
//    }
//    static void print40Years (Staff [] old) {
//        for (Staff staff:old) {
//            if (staff.age > 40) {
//                System.out.println(staff.toString());
//            }
//        }

    }
}
