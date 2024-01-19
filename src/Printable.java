interface Printable {
    abstract void print ();

}
interface showable {
    abstract void show();
}
class Human implements Printable,showable {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        Human h = new Human();

       h.print();
       h.show();
    }
}