package toyProject1.showCat.repository;

import toyProject1.showCat.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {


    Member save(Member member);
    Optional<Member> findById(Long id);
    //    Optional<Member> findByName();
    List<Member> findAll();
    Boolean checkDuplicate(long memberId);

}

