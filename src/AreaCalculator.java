import java.util.List;

public class AreaCalculator implements IAreaCalculator{

  @Override
  public double sum(List<Shape> shapes) {
    double sum = 0;
    for (int i=0; i< shapes.size(); i++) {
      sum += shapes.get(i).area();
    }

    return sum ;
  }


}
