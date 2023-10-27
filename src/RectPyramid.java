public class RectPyramid {
    private static double side_a;
    private static double side_h;

    public RectPyramid(double side_a,  double side_h) {
        RectPyramid.side_a = side_a;

        RectPyramid.side_h = side_h;
    }
    public RectPyramid(){
    }



    public static double area(double side_a, double side_h) {
        double per = (side_a + side_a) * 2;
        System.out.println(per);

        double areaBaza = side_a * side_a;
        System.out.println(areaBaza);

        double half_side_b = side_a / 2;
        double apotheme1 = Math.sqrt((Math.pow(side_h, 2)) + Math.pow(half_side_b, 2));
        System.out.println(apotheme1);

        double areaLateral = per * 0.5 * apotheme1;
        System.out.println(areaLateral);

        return  areaLateral+areaBaza;
    }
    public static void area() {
        double per = (getSide_a() + getSide_a()) * 2;
        System.out.println(per);

        double areaBaza = getSide_a() * getSide_a();
        System.out.println(areaBaza);

        double half_side_b = getSide_a() / 2;
        double apotheme1 = Math.sqrt((Math.pow(getSide_h(), 2)) + Math.pow(half_side_b, 2));
        System.out.println(apotheme1);

        double areaLateral = per * 0.5 * apotheme1;
        System.out.println(areaLateral);
        System.out.println("Площа = "+(areaLateral+areaBaza));

    }

    public static void volume(){
        double areaBaza = getSide_a() * getSide_a();

        double volume = areaBaza *getSide_h()*1/3;

        System.out.println("обєм = "+volume);
    }

    public static double volume(double side_a, double side_h){
        double areaBaza = side_a * side_a;

        double volume = areaBaza *side_h*1/3;

        return volume;
    }

    public static double getSide_a() {
        return side_a;
    }

    public static double getSide_h() {
        return side_h;
    }
}
