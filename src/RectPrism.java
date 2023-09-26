public class RectPrism {
    private double side_a;
    private double side_b;
    private double side_h;

    public RectPrism(double side_a, double side_b, double side_h) {// конструктор
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_h = side_h;
    }
    public RectPrism() {// пустий кнструктор
    }

    public double getSide_a() {
        return side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public double getSide_h() {
        return side_h;
    }

    public double area(double side_a, double side_b, double side_h) {// метод для обрахуйнку площі
        return 2 * ((side_a * side_b) + (side_a * side_h) + (side_b * side_h));

    }// використав поліморфізм
    public void area() {
        double area = 2 * ((getSide_a() * getSide_b()) + (getSide_b() * getSide_h()) + (getSide_h() * getSide_a()));
        System.out.println("Площа = " + area);
    }

    public double volume(double side_a, double side_b, double side_h) {
        return side_b * side_a * side_h;
    }

    public void volume() {
       double sumVolum=  getSide_a() * getSide_b() * getSide_h();
        System.out.println("Об'єм = "+sumVolum);
    }

    // рекурсія
     public int fibonachi(int v){
        if(v<= 1){
            return v;
        }else {
            return (fibonachi(v-1)) + (fibonachi(v-2));
        }
     }

}
