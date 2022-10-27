package c8.Cylinde;

public class Cylinder {
  private  double radius = 1 ;
  private double height = 1;


    public void setRadius(double rad){
        if (rad > 0 ){
          radius = rad;
        }else {
          throw new IllegalArgumentException("Radius must be positive");
        }
    }
    public double getRadius(){
      return radius;
    }
    public void setHeight(double h){
      if (h > 0){
        height = h;
      }else {
        throw new IllegalArgumentException("Height must be positive");
      }
    }
    public double getHeight(){
      return height;
    }
    public double calculateVolume(){
     return 3.142 * getRadius() * getRadius() * getHeight();
    }
}
