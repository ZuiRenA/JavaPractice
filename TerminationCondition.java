public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
class Book{
    boolean checkOut = false;
    Book(boolean checkOut){
        checkOut = checkOut;
    }
    void checkIn(){
        checkOut = false;
    }
    protected void finalize(){
        if (checkOut){
            System.out.println("Error:checked out");
        }
    }
}
