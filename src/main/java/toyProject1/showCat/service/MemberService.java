package toyProject1.showCat.service;

import toyProject1.showCat.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    void join(Member member);
    List<Member> findMembers();
    Optional<Member> findMember(Long memberId);

}
