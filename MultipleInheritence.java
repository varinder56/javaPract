interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing the document...");
    }

    @Override
    public void show() {
        System.out.println("Showing the document...");
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {

        Document obj = new Document();

        obj.print();
        obj.show();
    }
}