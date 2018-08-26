public class PassingThis {
    public static void main(String[] args){
        new Apple();
    }
}
class Apple{
    public Apple(){
        this("red");
    }
    protected Apple(String color){
        System.out.println("颜色: " + color);
    }
}

