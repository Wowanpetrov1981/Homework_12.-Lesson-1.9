import Homework_12.Author;
import Homework_12.Book;

public class Main {

    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] age = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + "Возраст - " + age[i]);

        }
        Person sarah = new Person("Sarah",  30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John", 13);

        System.out.println();
        System.out.println("Задание к уроку 1.9");
        Book book = new Book("Война и мир", new Author("Лев", "Толстой"), 2018);
        Author author = new Author("Толстой", "Лев");
        System.out.println("book.getTitle() = " + book.getTitle());
        System.out.println("author.getName() = " + author.getName());
        System.out.println("author.getLastName() = " + author.getLastName());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        book.setYearOfPublication(2020);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println();

        Book book1 = new Book("Преступление и наказание", new Author("Достоевский", "Фёдор"), 2017);
        Author author1 = new Author("Достоевский", "Фёдор");
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("author1.getName() = " + author1.getName());
        System.out.println("author1.getLastName() = " + author1.getLastName());
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
    }
}