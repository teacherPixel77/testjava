import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    double grade;
    LinkedList<String> listOfStudents = new LinkedList<>();
    ArrayList<Integer> averageScore = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void addListOfStudents() {
        System.out.print("Добавления студента в список : ");
        name = scanner.nextLine();
        listOfStudents.add(name);
        System.out.print("Добавьте балл студенту : ");
        int stringOfDobule = Integer.parseInt(scanner.nextLine());
        averageScore.add(stringOfDobule);
        double num = 0;
        for (int val: averageScore) {
            int valueSize = averageScore.size();
            num += val;
            this.grade = num / valueSize;
        }
        System.out.println("Средний балл всех студентов в списке : " + this.grade);

    };
    public void delListOfStudents() {
        System.out.print("Удаления студента из списка по имени : ");
        name = scanner.nextLine();
        listOfStudents.remove(name);
    };
    public void searchListOfStudents() {
        System.out.print("Поиска студента по имени и отображения его информации : ");
        name = scanner.nextLine();
        boolean searchName = listOfStudents.contains(name);
        if (searchName) {
            System.out.println("Студент : " + name + " найден");
        }
        else {
            System.out.println("Студент Не найден!");
        }
        System.out.println(listOfStudents);
    };
}




