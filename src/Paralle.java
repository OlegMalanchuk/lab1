public class Paralle
{
    private  double length ,width, height;

    public Paralle (){}
    public Paralle(double len , double wid, double hei){
        this.length = len;
        this.width=wid;
        this.height = hei;
    }
    public Paralle(double len , double wid){//конструктор для паралелепіпеда в якого бічна сторона куб
        this.length = len;/// логіка не докінця правильна
        this.width=wid;
        this.height = wid;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area(double a,double b, double c){
        double areaFull = 2*(a*b+b*c+c*a);
        return areaFull;
    }
    public void area(){
        double areaFull = (2*(getHeight()*getLength()+getLength()*getWidth()+getWidth()*getHeight()));
        System.out.println("Площа = "+ areaFull);
    }

    public double volum(double a,double b, double c){
        double volum = a*b*c;
        return volum;
    }
    public void volum(){
        double volum = getHeight()*getWidth()*getLength();
        System.out.println("Обєм = "+volum);
    }

























}
