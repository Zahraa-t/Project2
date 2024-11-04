import java.util.Scanner;

public class LinearEquationLogic {
    private LinearEquation equation;
    private Scanner myScanner;
    private String yOrN;

    public LinearEquationLogic() {
        myScanner = new Scanner(System.in);
        String yOrN = "y";
    }

    public void start() {
        point();
    }

    public void point() {
        System.out.println("Welcome to the linear equation calculator");
        getCoordinates();
        anotherPair();
        while (yOrN.equals("y")) {
            getCoordinates();
            anotherPair();
            System.out.println();
        }
        System.out.println("Goodbye! Thanks for using this slope calculator.");
    }

    private void anotherPair () {
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        yOrN = myScanner.nextLine();
    }

    private void getCoordinates() {
        System.out.print("Enter coordinate 1: ");
        String coord1 = myScanner.nextLine();
        int space = coord1.indexOf(" ");
        String xCoord1 = coord1.substring(1, space - 1);
        String yCoord1 = coord1.substring(space + 1, coord1.length() - 1);

        System.out.print("Enter coordinate 2: ");
        String coord2 = myScanner.nextLine();
        int space1 = coord2.indexOf(" ");
        String xCoord2 = coord2.substring(1, space1 - 1);
        String yCoord2 = coord2.substring(space1 + 1, coord2.length() - 1);

        int x1 = Integer.parseInt(xCoord1);
        int y1 = Integer.parseInt(yCoord1);
        int x2 = Integer.parseInt(xCoord2);
        int y2 = Integer.parseInt(yCoord2);

        if (x1 != x2) {
            equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println();
            System.out.println(equation.lineInfo());
            getXValue();
        } else {
            System.out.println("You cannot enter two points with the same x value.\n");
        }
    }

    public void getXValue() {
        System.out.print("Enter a value for x: ");
        double xNum = myScanner.nextDouble();
        System.out.println(equation.coordinateForX(xNum));
        myScanner.nextLine();
    }
}
