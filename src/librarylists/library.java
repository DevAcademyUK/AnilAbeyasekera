package librarylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class library {

    Scanner myScanner = new Scanner(System.in);

    List<book> books = new ArrayList<book>();
    List<member> members = new ArrayList<member>();
    List<loan> loans = new ArrayList<loan>();

    public static void main(String[] args) {
        library lib = new library();
        lib.init();
    }

    public void init() {
        books.add(new book(1, "In Search of Lost Time", "Marcel Proust", "1913"));
        books.add(new book(2, "Ulysses", "James Joyce", "1922"));
        books.add(new book(3, "Moby Dick", "Herman Melville", "1851"));
        books.add(new book(4, "Pride and Prejudice", "Jane Austen", "1813"));
        books.add(new book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387"));

        members.add(new member(1, "Dean", "Lewis", (byte) 30));
        members.add(new member(2, "Steve", "Beckwith", (byte) 55));
        members.add(new member(3, "Lisa", "Crow", (byte) 39));
        members.add(new member(4, "Vicky", "Cross", (byte) 37));
        members.add(new member(5, "Rachel", "Alsop", (byte) 25));

        loans.add(new loan(2, 4));
        loans.add(new loan(5, 2));

        menu();

    }

    public void menu() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Dean's Library");
        System.out.println("Select an option from the list below:");
        System.out.println("1 - Search for a book");
        System.out.println("2 - Check is a book is available");
        System.out.println("3 - Search for an author");

        int choice = Integer.parseInt(myScanner.nextLine());
        switch (choice) {
            case 1:
                searchBook();
                break;

            case 2:
                checkBook();
                break;

            case 3:
                searchAuthor();
                break;

            case 4:
                searchMember();
                break;

            default:
                System.out.println("Invalid input provided, please try again");
                menu();
        }
    }

    private void searchBook() {
        System.out.println("How would you like to sort the authors?");
        System.out.println("1. Book Title (A-Z)");
        System.out.println("2. Book Title (Z-A)");
        System.out.println("3. Book Year (Most to least recent)");
        System.out.println("4. Book Year (Least to most recent)");

        int choice = Integer.parseInt(myScanner.nextLine());
        switch (choice){
            case 1:
                Collections.sort(books);
                for (book a : books) {
                    System.out.println(a.bookTitle);
                }
            case 2:
                Collections.reverse(books);
                for (book b : books) {
                    System.out.println(b.bookTitle);
                }
            case 3:
                Collections.sort(books, book.bookYearComparator);
                for (book c : books){
                    System.out.println(c.bookTitle);
                }
            case 4:
                Collections.sort(books, book.bookYearComparator.reversed());
                for (book d : books){
                    System.out.println(d.bookTitle);
                }

        }
    }

    private void checkBook() {
        System.out.println("Which book would you like to check the availability for?");
        String title = myScanner.nextLine();

        for (int i = 0; i < books.size(); i++) {


            if (books.get(i).bookTitle.equalsIgnoreCase(title)) {

                for (int j = 0; j < loans.size(); j++) {
                    if (books.get(i).bookID == loans.get(j).bookID) {
                        System.out.println("This book is unavailable right now.");
                        System.out.println();
                        menu();

                    } else if (j == loans.size() - 1) {
                        System.out.println("This book is available.");
                        System.out.println();
                        menu();

                    }
                }
            }
            else if(i == books.size() - 1) System.out.println("Sorry, we do not currently stock that book");
        }
    }

        private void searchAuthor () {

            Collections.sort(books, book.bookAuthorComparator);

            for (book b : books) {
                System.out.println(b.bookAuthor);
            }
        }

        private void searchMember(){

        }

    }
