package toyProject1.showCat.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import toyProject1.showCat.domain.Member;

import java.util.*;

@Repository
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    private static Long sequence = 0L;


    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.of(store.get(id));
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Boolean checkDuplicate(long memberId) {
        boolean isExist = store.containsKey(memberId);
        return isExist;
    }
}
