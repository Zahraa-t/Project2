public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1,int y1 ,int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return roundedToHundredth(distance);
    }

    public double yIntercept() {
        double yInt = y1 - (slope() * x1);
        return roundedToHundredth(yInt);
    }

    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }

    public String equation() {
        if (slope() != 0) {
            int m = (y2 - y1);
            int m2 = (x2 - x1);
            String mSlope = m +"/"+ m2;
            if (yIntercept() > 0) {
                return "y = " + mSlope + "x + " + yIntercept();
            } else {
                return "y = " + mSlope + "x - " + Math.abs(yIntercept());
            }
        } else {
            return " y = " + yIntercept();
        }
    }

    public String lineInfo() {
        String coord1 = "(" + x1 + ", " + y1 + ")";
        String coord2 = "(" + x2 + ", " + y2 + ")";
        return "The two points are: " + coord1 + " and " + coord2 + "\nThe equation of the line between these points is:  " + equation() + "\nThe y-intercept of the line is: " + yIntercept() + "\nThe slope of this line is: " + slope() + "\nThe distance between the two points is : " + distance() + "\n";
    }

    public String coordinateForX(double xEntered) {
        double newYCoordinate = slope() * xEntered + yIntercept();
        return "The point on the line is (" + xEntered + ", " + newYCoordinate + ")\n";
    }

    public double roundedToHundredth(double num) {
        return (Math.round(num * 100) / 100.0);
    }

}
