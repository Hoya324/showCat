package toyProject1.showCat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import toyProject1.showCat.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberControllerImpl {

    private final MemberService memberService;
}
