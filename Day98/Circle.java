/**
 * this class extends GeometryExample class which has two methods area and perimeter
 * this class specially used for calculating area and circumference of circle
 */
public class Circle extends GeometryExample{
    int radius=0;
    static double pie=2.14;
    Circle(int radius){
        this.radius=radius;
    }
    Circle(){

    }
    /**
     *
     * this method is used to calculate area of circle using formula 2*pie(radius*radius)
     * @param s is the radius of a circle
     * @return it returns the area
     */

    @Override
    public void area(int...s) {
        if(s.length==0){
            double a=2*pie*(Math.pow(this.radius,2));
            System.out.println("Area of circle: " +a);
        }else{
            int radius = s[0];
            double circleArea = 2*pie*(Math.pow(radius,2));
            System.out.println("Area of circle: " + circleArea);
        }

    }
    /**
     *
     * this method is used to calculate circumference of circle using formula 2*pie*radius
     * @param a is the side of a circle
     * @return it returns the circumference
     */

    @Override
    public void perimeter(int... a) {
        if(a.length==0){
            double p=2*pie*this.radius;
            System.out.println("circumference of circle: " +p);
        }else{
            int radius = a[0];
            double circlePerimeter = 2*pie*radius;
            System.out.println("circumference of circle: " + circlePerimeter);
        }
    }
}
