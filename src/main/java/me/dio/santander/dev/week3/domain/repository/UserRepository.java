package me.dio.santander.dev.week3.domain.repository;

import me.dio.santander.dev.week3.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
