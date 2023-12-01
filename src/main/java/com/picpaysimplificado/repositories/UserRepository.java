package com.picpaysimplificado.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.picpaysimplificado.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByDocument(String document);

    Optional<User> findUserById(Long id);

    UserDetails findByEmail(String email);
}
