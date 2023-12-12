package lib043;

public class BookList66043 {
    private final Book66043 book;
    private BookList66043 next;
    private BookList66043(Book66043 book){ this.book = book; }
    public static BookList66043 newList(){
        return new BookList66043(null);
    }
    public boolean add(Book66043 book){
        if (book == null) return false;
        var current = this;
        while (current.next != null){
            current = current.next;
            if (current.book.equals(book)) return false;
        }
        current.next = new BookList66043(book);
        return true;
    }
    @Override
    public String toString(){
        var current = this;
        var sb = new StringBuilder();
        sb.append("BookList{");
        while ((current=current.next) !=null){
            sb.append("\n  ") .append(current.book);
        }
        return sb.append("}").toString();
    }
    public double totalPrice043(){
        double sum = 0.0;
        for (var cur = this.next; cur != null; cur = cur.next){
            sum += cur.book.getPrice043();
        }
        return sum;
    }
    public boolean remove043(Book66043 book){
        if (book == null) return false;
        BookList66043 cur = this;
        while (cur.next != null ) {
            if (cur.next.book.equals(book)) {
                cur.next = cur.next.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}