public class TrianPrism {
    private double side_a;
    private double side_b;
    private double side_c;
    private double side_h;

    public TrianPrism(double side_a, double side_b, double side_c, double side_h){
        this.side_a =side_a;
        this.side_b =side_b;
        this.side_c =side_c;
        this.side_h =side_h;
    }
    public TrianPrism(){}


    ///NEW NEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEW
    private double area(double side_a, double side_b, double side_c, double side_h){
        double p = (side_a+side_b+side_c)/2;//пів периметр
        System.out.println(p);
        double areaBaza =  Math.sqrt(p*((p - side_a)*(p-side_b)*(p-side_c)));//площа основи
        System.out.println(areaBaza);
        double areaLateral = (side_a+side_b+side_c)*side_h;// площа бічна
        return  areaLateral+(2*areaBaza);
    }
    public double getArea(double a, double b, double c, double h){
        double a1 = a;
        double b1 = b;
        double c1 = c;
        double h1 = h;
        double sum = area(a1,b1,c1,h1);
        return sum;
    }

   private  void area(){
        double p = (getSide_a()+getSide_b()+getSide_c())/2;//пів периметр
        System.out.println(p);
        double areaBaza =  Math.sqrt(p*((p - getSide_a())*(p-getSide_b())*(p-getSide_c())));//площа основи
        System.out.println(areaBaza);
        double areaLateral = (getSide_a()+getSide_b()+getSide_c())*getSide_h();// площа бічна
         double sum = areaLateral+(2*areaBaza);
        System.out.println("Площа = "+sum);
    }
    public void getArea(){
        area();
    }
    ///NEW NEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEWNEW
    //  я не робив так із всіма бо це пута трата часу



    public double volume(double side_a, double side_b, double side_c, double side_h){
        double p = (side_a+side_b+side_c)/2;//пів периметр
        double areaBaza =  Math.sqrt(p*((p - side_a)*(p-side_b)*(p-side_c)));//площа основи
        return (areaBaza *side_h);

    }
    public void volume(){
        double p = (getSide_a()+getSide_b()+getSide_c())/2;//пів периметр
        double areaBaza =  Math.sqrt(p*((p - getSide_a())*(p-getSide_b())*(p-getSide_c())));//площа основи
        double volume = areaBaza *getSide_h();
        System.out.println("Обєм = "+volume);
    }




    public double getSide_a() {
        return side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public double getSide_c() {
        return side_c;
    }

    public double getSide_h() {
        return side_h;
    }
}
