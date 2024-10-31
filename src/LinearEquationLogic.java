import java.util.Scanner;

public class LinearEquationLogic {
    private LinearEquation equation;
    private Scanner myScanner;
    private String yOrN;

    public void start() {
        point();
    }

    private void getCoordinates() {
        System.out.println("Enter coordinate 1: ");
        String coord1 = myScanner.nextLine();
        int space = coord1.indexOf(" ");
        String xcoord1 = coord1.substring(1, space - 1);
        String ycoord1 = coord1.substring(space + 1, coord1.length() - 1);

        System.out.println("Enter coordinate 1: ");
        String coord2 = myScanner.nextLine();
        int space1 = coord2.indexOf(" ");
        String xcoord2 = coord2.substring(1, space - 1);
        String ycoord2 = coord2.substring(space + 1, coord2.length() - 1);

        int x1 = Integer.parseInt(xcoord1);
        int y1 = Integer.parseInt(ycoord1);
        int x2 = Integer.parseInt(xcoord2);
        int y2 = Integer.parseInt(ycoord2);

        equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation.lineInfo());
    }

    public void point() {
        System.out.println("Welcome to the linear equation calculator");
        yOrN = "y";
        while (yOrN.equals("y")) {
            System.out.println("Would you like to enter another pair of coordinates? y/n: ");
            String yOrN = myScanner.nextLine();
            if (yOrN.equals("y")) {
                getCoordinates();
                System.out.println("Enter a value for x: ");
                getXValue();
            } else {
                System.out.println("Goodbye! Thanks for using this slope calculator.");
            }
        }
    }

    public void getXValue() {
        int xNum = myScanner.nextInt();
        equation.coordinateForX(xNum);
    }
}
