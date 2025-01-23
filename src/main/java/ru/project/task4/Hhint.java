package ru.project.task4;



public class Hhint {
    public static void main(String[] args) {
        String in = "круг 3";
        System.out.println(Hhint.result(in));

    }

    public static String result(String input) {


        String[] parts = input.split(" ");
        String figureType = parts[0].toLowerCase();
        double measurement = parts.length > 1 ? Double.parseDouble(parts[1]) : 1.0;

        double area ;
        double perimeter ;

        switch (figureType) {
            case "круг":
                area = calculateCircleArea(measurement);
                perimeter = calculateCirclePerimeter(measurement);
                break;
            case "квадрат":
                area = calculateSquareArea(measurement);
                perimeter = calculateSquarePerimeter(measurement);
                break;
            default:
                throw new IllegalArgumentException("Неверный тип фигуры: " + figureType);
        }

        System.out.printf("%.2f %.2f\n", area, perimeter); // Форматированный вывод результата
        return figureType;
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    private static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }

    private static double calculateSquarePerimeter(double sideLength) {
        return 4 * sideLength;

    }
}
