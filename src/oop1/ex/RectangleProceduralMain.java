package oop1.ex;

public class RectangleProceduralMain {

    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = caculateArea(width,height);
        System.out.println("넓이:" +area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레길이:" + perimeter);

        boolean squre = isSquare(width,height);
        System.out.println("정사각형 여부:" + squre);
    }

    static int caculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
