package com.capstone.ecom.repository;

import com.capstone.ecom.entity.User;
import com.capstone.ecom.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);

    Optional<User> findByEmail(String username);

    User findByRole(UserRole userRole);
}
