package toyProject1.showCat.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import toyProject1.showCat.AutoAppConfig;
import toyProject1.showCat.domain.BreedOfCats;
import toyProject1.showCat.domain.Gender;
import toyProject1.showCat.domain.Grade;
import toyProject1.showCat.domain.Member;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);


    @Test
    @DisplayName("회원 가입")
    void join() {
        MemberService memberService = ac.getBean(MemberService.class);

        Member member = new Member(1L, "client1", Grade.Butler, "navy", BreedOfCats.BombayCat, Gender.female, 13);

        memberService.join(member);
        Optional<Member> findMember = memberService.findMember(member.getId());

        System.out.println("member name = " + member.getClientName());
        System.out.println("member1 = " + findMember.get());

        assertThat(member.getClientName()).isEqualTo(findMember.get().getClientName());
    }
}
