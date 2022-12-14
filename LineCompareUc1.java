public class LineCompareUc1 {

    private int x1;

    private int y1;

    private int x2;

    private int y2;


    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX1() {
        return x1;
    }


    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY1() {
        return y1;
    }


    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX2() {
        return x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY2() {
        return y2;
    }

    public int result() {
        int length = (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);

        return length;
    }

    public static void main(String[] args) {

        LineCompareUc1 findLengthOfLine = new LineCompareUc1();

        findLengthOfLine.setX1(20);
        findLengthOfLine.setX2(40);
        findLengthOfLine.setY1(40);
        findLengthOfLine.setY2(80);


        System.out.println("The length between two Co-ordinates is: " + findLengthOfLine.result());


    }

}