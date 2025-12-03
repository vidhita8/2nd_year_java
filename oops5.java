
import java.util.*;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable = true;
    private Member borrowedBy;

    static int totalBooks = 0;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        totalBooks++;
    }

    public String getTitle() { return title; }
    public String getISBN() { return ISBN; }
    public boolean isAvailable() { return isAvailable; }
    public Member getBorrowedBy() { return borrowedBy; }

    public void borrowBook(Member member) {
        if (isAvailable) {
            isAvailable = false;
            borrowedBy = member;
            member.borrowBook(this);
        } else {
            System.out.println("❌ " + title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            borrowedBy.returnBook(this);
            borrowedBy = null;
            isAvailable = true;
        }
    }

    public void displayBook() {
        if (isAvailable)
            System.out.println(title + " Available");
        else
            System.out.println(title + " Borrowed by " + borrowedBy.getName());
    }
}

class Member {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    static int totalMembers = 0;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        totalMembers++;
    }

    public String getName() { return name; }
    public int getMemberId() { return memberId; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty())
            System.out.println("No books borrowed.");
        else
            for (Book b : borrowedBooks)
                System.out.println(b.getTitle());
    }
}

class Library {
    static List<Book> books = new ArrayList<>();
    static List<Member> members = new ArrayList<>();

    public static void addBook(Book book) { books.add(book); }
    public static void addMember(Member member) { members.add(member); }

    public static void borrowBook(String ISBN, int memberId) {
        Book bookToBorrow = null;
        Member borrowingMember = null;

        for (Book b : books)
            if (b.getISBN().equals(ISBN))
                bookToBorrow = b;

        for (Member m : members)
            if (m.getMemberId() == memberId)
                borrowingMember = m;

        if (bookToBorrow != null && borrowingMember != null)
            bookToBorrow.borrowBook(borrowingMember);
        else
            System.out.println("❌ Invalid ISBN or Member ID.");
    }

    public static void returnBook(String ISBN, int memberId) {
        for (Book b : books)
            if (b.getISBN().equals(ISBN) && !b.isAvailable()) {
                b.returnBook();
                System.out.println("✅ Book returned successfully.");
                return;
            }
        System.out.println("❌ Book not found or already available.");
    }

    public static void displayLibraryInfo() {
        System.out.println("\nLibrary Management System");
        System.out.println("Total Books: " + Book.totalBooks);
        System.out.println("Total Members: " + Member.totalMembers);
        System.out.println("Books Available:");
        int i = 1;
        for (Book b : books) {
            System.out.print(i++ + ". ");
            b.displayBook();
        }
        for (Member m : members)
            m.displayBorrowedBooks();
    }
}

public class oops5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 📚 Add Books
        System.out.print("Enter number of books: ");
        int nBooks = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= nBooks; i++) {
            System.out.print("Enter Book " + i + " title: ");
            String title = sc.nextLine();
            System.out.print("Enter Book " + i + " author: ");
            String author = sc.nextLine();
            System.out.print("Enter Book " + i + " ISBN: ");
            String isbn = sc.nextLine();

            Library.addBook(new Book(title, author, isbn));
        }

        // 👥 Add Members
        System.out.print("\nEnter number of members: ");
        int nMembers = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= nMembers; i++) {
            System.out.print("Enter Member " + i + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter Member " + i + " ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            Library.addMember(new Member(name, id));
        }

        // 📖 Borrow book
        System.out.print("\nEnter ISBN of book to borrow: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Member ID: ");
        int id = sc.nextInt();
        Library.borrowBook(isbn, id);

        // 🔁 Optional return
        sc.nextLine();
        System.out.print("Do you want to return a book? (yes/no): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter ISBN of book to return: ");
            String returnIsbn = sc.nextLine();
            System.out.print("Enter Member ID: ");
            int returnId = sc.nextInt();
            Library.returnBook(returnIsbn, returnId);
        }

        // 🧾 Display Summary
        Library.displayLibraryInfo();
        sc.close();
    }
}
