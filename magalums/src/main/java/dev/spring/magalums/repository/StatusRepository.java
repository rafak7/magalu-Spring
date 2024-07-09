package dev.spring.magalums.repository;

import dev.spring.magalums.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
