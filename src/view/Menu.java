package view;

import controll.BooksManager;
import java.util.Scanner;

public class Menu {
    private BooksManager booksManager;

    public Menu(BooksManager booksmanager) {
        this.booksManager = booksmanager;
    }

    public void selectAction(Scanner scanner) {
        while (true){
            System.out.println("Выберите вариант ответа в виде числа: 1. Добавить новую книгу  " +
                    "2. Посмотреть инфо по существующей. 3. Посмотреть список книг. 0. Для выхода из программы ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0: return;
                case 1: System.out.println("Введите название добавляемой книги");
                    booksManager.addBook(scanner);
                    break;
                case 2: System.out.println("Введите номер книги, которую хотите найти");
                    booksManager.findAndRemoveBook(scanner);
                    break;
                case 3: System.out.println(booksManager.getBooks());
                    System.out.println("Количество книг: " + booksManager.getAmountBooks());
                    break;
            }
            System.out.println(""); // разделитель, для вывода на экран в более понятном виде.
        }
    }
}

//default
