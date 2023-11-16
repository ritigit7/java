package Practice_CODE;

abstract class Pen {
    public void print() {
        System.out.println("this line is from print method of pen....");
    }

    abstract void write();

    abstract void refill();
}

class Ballpen extends Pen {
    public void write() {
        System.out.println("this line is from write method of pen....");
    }

    public void refill() {
        System.out.println("this line is from refill method of pen....");
    }
}

class Library {

    String[] books;
    int total_book;

    Library() {
        this.books = new String[10];
        this.total_book = 0;
    }

    public void addBook(String str) {
        this.books[this.total_book++] = str;
    }

    public void returnBook(String str) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] == str)
                this.books[i] = null;
            this.total_book--;
        }
    }

    public void showAvialable() {
        for (String str : books) {
            if (str != null)
                System.out.println(str);
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        // Ballpen obj = new Ballpen();
        // obj.print();
        Library obj2 = new Library();
        obj2.addBook("book 1");
        obj2.addBook("book 2");
        obj2.addBook("book 3");
        obj2.showAvialable();
        obj2.returnBook("book 1");
        obj2.showAvialable();
    }
}
