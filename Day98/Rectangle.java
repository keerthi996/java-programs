/**
 * this class extends GeometryExample class which has two methods area and perimeter
 * this class specially used for calculating area and perimeter of Rectangle
 */
public class Rectangle extends GeometryExample{
    int length=0;
    int breadth=0;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(){

    }
    /**
     *
     * this method is used to calculate area of rectangle using formula length*breadth
     * @param s is the length and breadth of a rectangle
     * @return it returns the area
     */

    @Override
    public void area(int...s) {
        if(s.length==0){
            int a=this.length*this.breadth;
            System.out.println("Area of Rectangle: " +a);
        }else{
            int length = s[0];
            int breadth=s[1];
            int rectangleArea = length* breadth;
            System.out.println("Area of Rectangle: " + rectangleArea);
        }

    }
    /**
     *
     * this method is used to calculate perimeter of rectangle using formula 2*(length+breadth)
     * @param a is the length and breadth of a rectangle
     * @return it returns the perimeter
     */

    @Override
    public void perimeter(int... a) {
        if(a.length==0){
            int p=2*(this.length+this.breadth);
            System.out.println("Perimeter of Rectangle: " +p);
        }else{
            int length= a[0];
            int breadth=a[1];
            int rectanglePerimeter = 4*(length+breadth);
            System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);
        }
    }
}
