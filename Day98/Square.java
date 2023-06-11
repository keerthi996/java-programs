/**
 * this class extends GeometryExample class which has two methods area and perimeter
 * this class specially used for calculating area and perimeter of square
 */
public class Square extends GeometryExample{
    /**
     * this is the initialization of variable
     */
    int side=0;


    Square(int side){
        this.side=side;
    }
    Square(){

    }
    /**
     *
     * this method is used to calculate area of square using formula side*side
     * @param s is the side of a square
     * @return it returns the area
     */

    @Override
    public void area(int...s) {
        if(s.length==0){
            int a=this.side*this.side;
            System.out.println("Area of square: " +a);
        }else{
            int side = s[0];
            int squareArea = side* side;
            System.out.println("Area of square: " + squareArea);
        }

    }
    /**
     *
     * this method is used to calculate perimeter of square using formula 4*side
     * @param a is the side of a square
     * @return it returns the perimeter
     */

    @Override
    public void perimeter(int... a) {
        if(a.length==0){
            int p=this.side*this.side;
            System.out.println("Perimeter of square: " +p);
        }else{
            int side = a[0];
            int squarePerimeter = 4* side;
            System.out.println("Perimeter of square: " + squarePerimeter);
        }
    }
}
