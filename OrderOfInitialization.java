public class OrderOfInitialization {
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
    public static void main(String[] args){
        /*House h = new House();
        h.f();
        */
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
}
class Bowl{
    Bowl(int marker){
        System.out.println("Bowl(" + marker +")");
    }
    void f1(int market){
        System.out.println("f1(" + market +")");
    }
}
class Table{
    static Bowl bowl1  = new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int market){
        System.out.println("f2(" + market + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}
class Cupboard{
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        System.out.println("Cupboard");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(6);
}
/*class Window{
    Window(int marker){
        System.out.println("Window(" + marker +")");
    }
}
class House{
    Window w1 = new Window(1);
    House(){
        System.out.println("House():");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){ System.out.println("f()"); }
    Window w3 = new Window(3);
}
*/
