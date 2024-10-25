import java.util.Scanner;


public class LinearEquationLogic {
    private LinearEquation equation;
    private Scanner myScanner;


    public void start() {
        getCoordinates();

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


        equation = new LinearEquation(x1, x2, y1, y2);
    }


}
