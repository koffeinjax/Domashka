/**
 * Created by User on 16.08.2016.
 */
public class Zadacha8  {
    public static void main(String[] args) {
        int age, height, weight, combined, mask;
        age = 28; //00011100
        height = 185; //10111001
        weight = 80; //01010000
        combined = (age) | (height << 8) | (weight << 16); //00000000 01010000 10111001 00011100

        mask = 0b11111111;

        System.out.printf("Age: " + (mask & combined) +
                " height: " + (mask & combined >>> 8) +
                " weight: " + (mask & combined >>> 16));
//Age: 28, height: 185, weight: 80
    }
}

