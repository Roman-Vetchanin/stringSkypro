public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        String firsName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firsName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О сотрудника - "+fullName);
        System.out.println("Задание №2");
        String upperFullName = fullName.toUpperCase();
        System.out.println(upperFullName);
        System.out.println("Задание №3");
        fullName = "Иванов Семён Семёнович";
        String s1 = fullName.replace("ё", "e");
        System.out.println("Данные Ф.И.О сотрудника - "+s1);
    }
}