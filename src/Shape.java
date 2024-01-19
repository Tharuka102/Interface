 interface Shape {
    abstract void getArea();
    default void getSides(){
        System.out.println("Side of this shape");
    }
}
class Rectangle implements Shape{
    @Override
    public void getArea() {
        int length =10; int width =15; int area = length * width ;
        System.out.println("Area Of Rectangle :- "+area);
    }

    @Override
    public void getSides() {
        System.out.println("I Have 2 side");
    }
}

class Square implements Shape {
    @Override
    public void getArea() {
        int length =20; int area = length *length ;
        System.out.println("Area of S1uare :-"+area);
    }
}
class test23{
    public static void main(String[] args) {
        Shape r =new Rectangle(); r.getArea(); r.getSides();
        Shape s= new Square(); s.getArea(); s.getSides();
    }
}