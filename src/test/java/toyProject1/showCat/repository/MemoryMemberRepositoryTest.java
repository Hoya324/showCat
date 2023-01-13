package toyProject1.showCat.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import toyProject1.showCat.AutoAppConfig;
import toyProject1.showCat.domain.BreedOfCats;
import toyProject1.showCat.domain.Gender;
import toyProject1.showCat.domain.Grade;
import toyProject1.showCat.domain.Member;

public class MemoryMemberRepositoryTest {
    @Test
    @DisplayName("회원 저장 테스트")
    void save() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberRepository memberRepository = ac.getBean(MemberRepository.class);
        Member member = new Member(1L, "client1", Grade.Butler, "navy", BreedOfCats.BombayCat, Gender.female, 13);

        System.out.println(member.getId());

    }
}
