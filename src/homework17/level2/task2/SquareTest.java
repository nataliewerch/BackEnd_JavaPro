package homework17.level2.task2;

public class SquareTest {
    public static void main(String[] args) {
        SquareOfTriangle sq = (a, b, c) -> Math.sqrt(((a + b + c) / 2) *
                                            (((a + b + c) / 2) - a) *
                                            (((a + b + c) / 2) - b) *
                                            (((a + b + c) / 2) - c));


        System.out.println(sq.square(3, 4, 5));
    }

    
}
