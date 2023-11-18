import java.util.List;

public class Main {

  public static void main(String[] args) {

    AreaCalculator areaCalculator = new AreaCalculator();
    PrintShape printShape = new PrintShape(areaCalculator);
    Circle circle = new Circle(3);
    Square square = new Square(4);
    List<Shape> shapes = List.of(circle, square);
    double sum = areaCalculator.sum(shapes);
    System.out.println("sum = " + sum);
    System.out.println(printShape.json(shapes));
  }
}