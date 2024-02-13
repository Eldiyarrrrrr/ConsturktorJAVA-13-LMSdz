import java.util.Arrays;

public class MyClass {
    String name;
    String surname;
    int age;
    String food;
    String[] lessons = {"java", "english", "soft skils"};

    public MyClass() {
    }

    public MyClass(String name, String surname, int age, String food, String[] lessons) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.food = food;
        this.lessons = lessons;

    }

    public String method() {
        return String.format("""
                Name:     %s
                Surname:    %s
                Age:     %d
                Food:    %s
                Lessons:   %s
                        
                """, name, surname, age, food, Arrays.toString(lessons));

    }


    }

