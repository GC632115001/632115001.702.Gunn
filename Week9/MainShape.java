package Week9;

class Shape {
    public String toString(){
        return "This is a shape";
     }
}
class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(int width ,int height){
        this.width = width;
        this.height = height;
    }
    public String toString(){
        super.toString();
        return "This is a rectantgle with width as "+ width + " and height as "+height+".";
    }
}
class Cube extends Shape{
    int length;
    public Cube(int length){
        this.length = length;
    }
    public String toString(){
        super.toString();
        return "This is a cube with the side of "+ length +".";
    }
}
public class MainShape {
    public static void main(String[] args){
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        Shape shape2 = new Rectangle(2,4);
        System.out.println(shape2.toString());

        Shape shape3 = new Cube(4);
        System.out.println(shape3.toString());

    }
}
