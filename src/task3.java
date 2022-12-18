public class task3 {
    public static void main(String[] args){
        int radius=5+(int)(Math.random()*20);
        System.out.println("Радиус окружности = "+radius+" см.");
        double constant=3.14;
        double square=constant*(radius*radius);
        System.out.println("Площадь окружности = "+square+" см².");
        double diameter=(2*radius);
        System.out.println("Длина окружности = "+constant*diameter+" см.");

    }
}
