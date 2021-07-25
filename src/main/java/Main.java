import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Sweet sweet1 = new Sweet();
        sweet1.weight(2);

        Barbaris barbaris1 = new Barbaris();
        barbaris1.weight(5);

        Belochka belochka1 = new Belochka();
        belochka1.weight(11);



        int arraySweet [] = {sweet1.weight, barbaris1.weight, belochka1.weight};
        int arraySweetLength = arraySweet.length;
        System.out.println(arraySweetLength);


    }

}