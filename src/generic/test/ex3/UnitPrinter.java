package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Shuttle;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
            T unit = t1.out();
            System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());

    }

    public static void printV2(Shuttle<? extends BioUnit> t1){
        System.out.println("이름: " + t1.out().getName() +", HP: "+ t1.out().getHp());
    }
}
