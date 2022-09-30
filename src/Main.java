public class Main {
    public static void main(String[] args) {
        // Задание 1
        String space = " ";
        String firstName = "Иванов" + space;
        String middleName = "Семён" + space;
        String lastName = "Семёнович";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 3
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

        // Задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

    }
}