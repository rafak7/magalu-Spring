package dev.spring.magalums.controller.dto;

import dev.spring.magalums.entity.Channel;
import dev.spring.magalums.entity.Notification;
import dev.spring.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {


    public Notification toNotification() {
        return new Notification(
            dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
