package service;

import entity.BookDetail;
import entity.Member;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MemberService {

    private Map<Integer, Member> members = new HashMap<>();

    public void addMember(String type){
        Member member = new Member();

        Integer memberId = Collections.min(members.keySet()) + 1;

        if (type.equals("S")){
            member.setType("Student");
            member.setId(memberId);
        } else if (type.equals("A")) {
            member.setType("Academic");
            member.setId(memberId);
        }

        members.put(memberId,member);

        System.out.printf("Created new member: %s [id: %d]%n", type, memberId);
    }
}
