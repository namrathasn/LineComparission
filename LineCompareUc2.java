public class LineCompareUc2 {

    private int x1;

    private int x2;

    private int y1;

    private int y2;

    private int j1;

    private int j2;

    private int k1;

    private int k2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getJ1() {
        return j1;
    }

    public void setJ1(int j1) {
        this.j1 = j1;
    }

    public int getJ2() {
        return j2;
    }

    public void setJ2(int j2) {
        this.j2 = j2;
    }

    public int getK1() {
        return k1;
    }

    public void setK1(int k1) {
        this.k1 = k1;
    }

    public int getK2() {
        return k2;
    }

    public void setK2(int k2) {
        this.k2 = k2;
    }


    public void show() {
        int length1 = (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);

        System.out.println("The length of first line is: " + length1);

        int length2 = (int) Math.sqrt((j2 - j1) ^ 2 + (k2 - k1) ^ 2);

        System.out.println("The length of Second line is: " + length2);

        String s1 = String.valueOf(length1);

        String s2 = String.valueOf(length2);

        if (s1.equals(s2)) {
            System.out.println("Two Lines are Equal......");

        } else {
            System.out.println("The Lines are Not Equal...");
        }
    }

    public static void main(String[] args) {
        LineCompareUc2 equalityOfTwoLines = new LineCompareUc2();

        equalityOfTwoLines.setX1(20);
        equalityOfTwoLines.setX2(40);
        equalityOfTwoLines.setY1(40);
        equalityOfTwoLines.setY2(80);

        equalityOfTwoLines.setJ1(20);
        equalityOfTwoLines.setJ2(40);
        equalityOfTwoLines.setK1(40);
        equalityOfTwoLines.setK2(80);

        equalityOfTwoLines.show();
    }

}