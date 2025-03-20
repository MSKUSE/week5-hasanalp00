public class Main {
    public static void main(String[] args) {
        Point p1=new Point();
        System.out.println(p1.xCoord);
        Point p2=new Point(1, 2);
        System.out.println(p2.yCoord);
        Point p3=new Point(3);
        System.out.println(p3.xCoord);


        Rectangle r1=new Rectangle(3,10,2);
        System.out.println(r1.getSideA());
    }
}
