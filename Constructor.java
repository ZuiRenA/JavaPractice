public class Constructor {
    public class Apricot{
        void pick(){}
        void pit(){pick();}
    }

    public static void main(String[] args) {
        leaf x = new leaf();
        x.increment().increment().increment().print();
    }
}
class Banana{
    void peel(int i){

    }
}
class leaf{
    int i = 0;
    leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }
}
