public class Circle {

   double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   public double getRadius(){
      return radius;
   }

   public double getCircumference() {
      return 2 * radius * Math.PI;
   }

}
