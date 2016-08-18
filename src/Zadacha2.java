/**
 * Created by User on 15.08.2016.
 */
public class Zadacha2 {
    String name;
    String says;

    public static void main(String[] args) {
        Zadacha2 Dog1 = new Zadacha2();
        Zadacha2 Dog2 = new Zadacha2();

        Dog1.name = "spot";
        Dog2.name = "scruffy";

        Dog1.says="Ruff!";
        Dog2.says="Wurf!";

        System.out.println("Dog1 name =" + Dog1.name +"   says=" + Dog1.says);
        System.out.println("Dog2 name =" + Dog2.name +"   says=" + Dog2.says);

    }
}

