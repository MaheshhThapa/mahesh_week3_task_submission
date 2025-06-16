class LibraryItem {
    String title;
    String author;
    int id;

    LibraryItem(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
    }

    void getInfo() {
        System.out.println("Title :" + title  );
        System.out.println("Author :" + author  );
        System.out.println("Id :" + id  );
    }
}

class Book extends LibraryItem {
    String genre;

    Book(String title, String author, int id, String genre){
        super(title, author, id);
        this.genre = genre;
    }
    @Override
    void getInfo() {
        System.out.println("Title :" + title  );
        System.out.println("Author :" + author  );
        System.out.println("Id :" + id  );
        System.out.println("Genre :" + genre  );
    }
}

class Magazine extends LibraryItem {
    String type;

    Magazine(String title, String author, int id, String type){
        super(title, author, id);
        this.type = type;
    }
    @Override
    void getInfo() {
        System.out.println("Title :" + title  );
        System.out.println("Author :" + author  );
        System.out.println("Id :" + id  );
        System.out.println("Type :" + type  );
    }
}

class Newpaper extends LibraryItem {
    String date;

    Newpaper(String title, String author, int id, String date){
        super(title, author, id);
        this.date = date;
    }
    @Override
    void getInfo() {
        System.out.println("Title :" + title  );
        System.out.println("Author :" + author  );
        System.out.println("Id :" + id  );
        System.out.println("Date :" + date  );
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] list = new LibraryItem[3];

        list[0] = new Book("Harry Puttar", "Sardhar Ji", 1, "Fiction");
        list[1] = new Magazine("Models", "Kim K", 2, "Fashion");
        list[2] = new Newpaper("Today's Specials", "KP Oli", 3, "13th December, 2006");

        list[0].getInfo();
        list[1].getInfo();
        list[2].getInfo();
    }
}