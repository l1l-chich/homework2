public class task2 {
    public static void main(String[] args){
        int width=5+(int)(Math.random()*10);
        int height=2+(int)(Math.random()*7);
        System.out.println("Ширина прямоугольника = "+width+" см.");
        System.out.println("Высота прямоугольника = "+height+" см.");
        System.out.println("Периметр прямоугольника = "+2*(width+height)+" см.");
        System.out.println("Площадь прямоугольника = "+width*height+" см².");
    }
}
