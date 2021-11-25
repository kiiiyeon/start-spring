package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJPAMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    //SELECT m FROM MEMBER m WHERE m.name = ?
    @Override
    Optional<Member> findByName(String name);


    //Optional<Member> findByNameAAndId(String name, Long id);
}
