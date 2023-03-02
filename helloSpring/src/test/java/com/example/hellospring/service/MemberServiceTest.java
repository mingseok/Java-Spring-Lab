package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.repository.MemoryMemberRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemberRepository memberRepository;

    @Before
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @Test
    void 회원가입() {
        //given(=이런 상황)
        Member member = new Member();
        member.setName("hello");

        //when(=이걸 실행 할때)
        Long saveId = memberService.join(member);

        //then(=결과가 이게 나와야 한다.)
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외() {
        // 어떤 상황
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        // 실행 할때
        memberService.join(member1);
        IllegalStateException e =
                assertThrows(IllegalStateException.class, () ->
                        memberService.join(member2));

        // 결과가 이거야 된다.
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
}