package day6;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Дмитрий", "Программирование");
        Student student = new Student("Наиль");
        teacher.evaluate(student);
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int grade = random.nextInt(4);
        String stringGrade = null;
        switch (grade) {
            case 0:
                stringGrade = "неудовлетворительно";
                break;
            case 1:
                stringGrade = "удовлетворительно";
                break;
            case 2:
                stringGrade = "хорошо";
                break;
            case 3:
                stringGrade = "отлично";
        }
        System.out.printf("Преподователь %s оценил студента с именем %s по предмету %s на оценку %s",
                name, student.getName(), subject, stringGrade);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}