/**
 * Created by User on 15.08.2016.
 */
public class Zadacha5 {
    public static void main(String[] args) {
        double n =78.2;
        double m =15;
        int a =60;
        double b= Math.abs(a-n);
        double c= Math.abs(a-m);

        if(b<c) {
            System.out.println("Число " + n +" находиться ближе к " + a);}
        if(b>c) {
            System.out.println("Число " + m + "находиться ближе к " + a);
        }
    }
}
