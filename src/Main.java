public class Main {

    public static void main(String[] args) {
        System.out.println("Name of group Internet_Explorer | GitHub Leader ID: Kristrox | GitHubID: Kristrox");
        // addition
        System.out.println((new ArithmeticsAdd()).Addition(2, 4));
        //multiplication example
        ArithmeticsMult multiplication = new ArithmeticsMult();
        System.out.println("result of multiplication = " + multiplication.Multiplication(20, 10));
        //difference example
        ArithmeticsDiff difference = new ArithmeticsDiff();
        System.out.println("result of difference 10 - 5 = " + difference.Difference(10, 5));
        // division
	    System.out.println(new BasicArithmeticsDivImpl().Division(3,4));
    }

    // Hergoln: Beznadziejny komentarz 1
}

