package toyProject1.showCat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import toyProject1.showCat.domain.Member;
import toyProject1.showCat.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

//    @Autowired
//    public MemberServiceImpl(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    @Override
    public void join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
    }

    private void validateDuplicateMember(Member member) {
        if (memberRepository.checkDuplicate(member.getId())) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }


    // 전체 회원 조회
    @Override
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    // 회원 조회
    // Optional<T> 쓸거면 null이 없어야하므로 예외 처리하기
    @Override
    public Optional<Member> findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
