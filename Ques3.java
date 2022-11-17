public class Ques3 {

   public static void main(String[] args) {

        shape myCircle=new Circle();
        myCircle.draw();
        myCircle.erase();

        shape myTriangle=new Triangle();
        myTriangle.draw();
        myTriangle.erase();

        Square mySquare= new Square();
        mySquare.draw();
        mySquare.erase();

    }
}
abstract class shape{
    abstract  void draw();
    abstract void erase();
}
class Circle extends shape{
    @Override
    void draw() {
        System.out.println("The Circle is being drawn");
    }

    @Override
    void erase() {
        System.out.println("The Circle is being erased");
    }
}
class Triangle extends shape{
    @Override
    void draw() {
        System.out.println("The Triangle is being drawn");
    }

    @Override
    void erase() {
        System.out.println("The Triangle is being erased");
    }
}
class Square extends shape{
    @Override
    void draw() {
        System.out.println("The Square is being drawn");

    }

    @Override
    void erase() {
        System.out.println("The Square is being erased");
    }
}