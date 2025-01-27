package java_mid_2.collection.set.member;

public class MemberNoHashNoEq  {

    //hashcode, equals 없음
    private String id;
    public MemberNoHashNoEq(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
