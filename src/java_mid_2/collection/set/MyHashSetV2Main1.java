package java_mid_2.collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args){
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println("set = " + set);

        System.out.println("A.hashCode() = "+ "A".hashCode());
        System.out.println("B.hashCode() = "+ "B".hashCode());
        System.out.println("AB.hashCode() = "+ "AB".hashCode());
        System.out.println("SET.hashCode() = "+ "SET".hashCode());

        //검색
        String search = "SET";
        boolean result = set.contains(search);
        System.out.println("set.contains( "+ search +" ) = " + result);

    }
}
