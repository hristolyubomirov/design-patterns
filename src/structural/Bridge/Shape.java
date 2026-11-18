package structural.Bridge;

public abstract class Shape {
   private final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
    public Color getColor(){
        return color;
    }
}
