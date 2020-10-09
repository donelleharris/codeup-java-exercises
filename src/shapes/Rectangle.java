package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //getter
    public Rectangle(int aLength, int aWidth){
        this.width = aWidth;
        this.length = aLength;
    }

    public int getPerimeter(){
        return 2 * length + 2 * width;
    }
    public int getArea (){
        return length * width;
    }
}