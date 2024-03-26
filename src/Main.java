import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer, Long> arithmetic = new Arithmetic<>(2548, (long) 4848);

        System.out.println("SUM: " + arithmetic.add());
        System.out.println("DIFF: " + arithmetic.subtract());
        System.out.println("PROD: " + arithmetic.multiply());
        System.out.println("QUO: " + arithmetic.divide());
        System.out.println("MIN: " + arithmetic.getMin());
        System.out.println("MAX: " + arithmetic.getMax());

        MyMap<Integer, String> map = new MyMap<>();

        map.put(0, "hala");
        map.put(1, "oh no");
        map.put(3, "omg");
        map.put(2, "omo");

        System.out.println("MAP CONTENTS");
        map.print();

        System.out.println("changing value of key 1");
        map.put(1, "o no no no");

        System.out.println("MAP CONTENTS");
        map.print();

        System.out.println("KEY 3 : " + map.get(3));

        System.out.println("Removing key 0 : " + map.remove(0));

        System.out.println("MAP CONTENTS");
        map.print();
    }
}
