package dev.spring.magalums.repository;

import dev.spring.magalums.entity.Notification;
import dev.spring.magalums.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List <Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
