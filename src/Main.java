import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /** MyClass деген класс тузунуз

         Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)

         Параметри эки башка болгон эки конструктор тузунуз

         MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз

         Эки объектке эки башка конструктор иштесин.

         Объекттердин маанилерин консольго чыгарыныз.**/

        MyClass myClass = new MyClass();
        myClass.name = "Kuba";
        myClass.surname = "Gapurov";
        myClass.age = 17;
        myClass.food = "Hoshan";
        System.out.println(myClass.method());


        MyClass myClass1 = new MyClass("Eldiyar" ,"Avazbekov", 18, "manty", myClass.lessons);
        System.out.println(myClass1.method());
    }
}