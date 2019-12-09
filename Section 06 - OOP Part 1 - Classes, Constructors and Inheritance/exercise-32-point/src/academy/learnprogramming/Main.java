package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Point first = new Point(6, 5);
	    Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance= " + point.distance());
    }
}
