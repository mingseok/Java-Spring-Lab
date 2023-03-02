package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원 등록 기능

    Optional<Member> findById(Long id); // ID로 회원을 찾는 기능

    Optional<Member> findByName(String name); // 이름으로 회원 찾는 기능

    List<Member> findAll(); // 모두 찾기
}
