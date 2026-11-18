package structural.Bridge;

public class Square extends Shape{

    public Square(Color color){
        super(color);
    }



    public void draw(){
        System.out.println("I am Square ");
    }

}
