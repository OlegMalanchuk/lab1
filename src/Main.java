public class Main {
    public static void main(String[] args) {
        Paralle paralle = new Paralle(3.3,3,4);
        paralle.area();
        System.out.println(paralle.area(3,3,4));
        paralle.volum();
        System.out.println(paralle.volum(3,5,3));
    }
}