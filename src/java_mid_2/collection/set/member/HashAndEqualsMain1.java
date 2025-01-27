package java_mid_2.collection.set.member;

import java_mid_2.collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        //object 에서 기본으로 제공하는 메소드를 사용함
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberNoHashNoEq search  = new MemberNoHashNoEq("A");
        System.out.println("search.hashCode() = " + search.hashCode());
        System.out.println("contains = "+set.contains(search));
    }
}
