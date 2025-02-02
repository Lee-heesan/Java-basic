package java_mid_2.collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();
    public void save(Member member) {
        // 코드 작성
        memberMap.put(member.getId(),member);
    }
    public void remove(String id) {
        // 코드 작성
        memberMap.remove(id);
    }
    public Member findById(String id) {
        // 코드 작성
        return memberMap.get(id);
    }
    public Member findByName(String name) {
        // 코드 작성
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
