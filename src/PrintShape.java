import java.util.List;

public class PrintShape {

  private final IAreaCalculator areaCalculator;

  public PrintShape(AreaCalculator areaCalculator) {
    this.areaCalculator = areaCalculator;
  }

  public String json(List<Shape> shapes) {
    double sum = areaCalculator.sum(shapes);
    return String.format("{sum: %s}", sum);
  }

}
