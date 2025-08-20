package com.hello.ToDoList.repository;

import com.hello.ToDoList.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
}
