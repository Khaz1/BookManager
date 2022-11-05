package controll;

import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksManager {
    private ArrayList<Book> books = new ArrayList<>();

    public BooksManager(boolean generateBooks) {
        if (generateBooks) generateBooks(10);
    }

    private void generateBooks(int size) {
        for (int i = 0; i < size; i++) {
            Book book = new Book("Степной волк", "Герман Гессе");
            books.add(book);
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getAmountBooks() {
        return books.size();
    }

    public void addBook(Scanner scanner) {
        String inputName = scanner.nextLine();
        System.out.println("Введите имя автора");
        String author = scanner.nextLine();
        Book newBook = new Book(inputName, author);
        books.add(newBook);

        System.out.println("Книга № " + (books.size() - 1) + " добавилась");
    }

    public void findAndRemoveBook(Scanner scanner) {
        int numbersBook = Integer.parseInt(scanner.nextLine());
        int bookCount = books.size() - 1;
        if (numbersBook >= books.size()) {
            System.out.println("Не верный номер введите от 0 до " + bookCount);
            findAndRemoveBook(scanner);
        } else {
            Book foundBook = books.get(numbersBook);
            System.out.println(foundBook);
            System.out.println("Книга найдена");
            System.out.println("Хотите ли вы удалить эту книгу? Введите номер подходящего ответа ");
            System.out.println("1. Да.  2. Нет");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                books.remove(foundBook);
                System.out.println("Книга удалена!");
            }
        }
    }
}