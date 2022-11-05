package src;

import src.ui.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooksManager booksManager = new BooksManager(true);
        Menu menu = new Menu(booksManager);
        menu.selectAction(scanner);
    }
}
