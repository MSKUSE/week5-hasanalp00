public class Rectangle{
    private Point topleft;
    private int sideA,sideB;
    public Rectangle(Point topleft,int sideA,int sideB){
        this.topleft=topleft;
        this.sideA=sideA;
        this.sideB=sideB;
        setSideA(sideA);
        setSideB(sideB);
    }
    public Rectangle(Point topleft,int sideA){
        this.topleft=topleft;
        this.sideA=sideA;
        setSideA(sideA);
    }
    public Square(Point topleft,int sideA){

    }
    public Point getTopLeft(){
        return topleft;
    }   
    public void setTopLeft(Point topleft){
        this.topleft=topleft;
    }
    public Point getSideA(){
        return sideA;
    }
    public void setSideA(int sideA){
        if (sideA<0){
            this.sideA =0;
            System.out.println("Side A cant bew negative.");
        }else{
        this.sideA=sideA;
        }
    public Point getSideB(){
        return sideB;
    }
    public void setSideB(int sideB){
        if (sideB<0){
            this.sideB =0;
            System.out.println("Side B cant bew negative.");
        }else{
        this.sideB=sideB; 
    }
    public int perimeter(){
        return (2*(sideA+sideB));
    }
    public int area(){
        return (sideA*sideB);
    }
    }
}
