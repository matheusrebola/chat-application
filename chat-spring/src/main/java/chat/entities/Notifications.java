package chat.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Notifications(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Boolean isRead,
		LocalDateTime createdAt,
		Users user,
		Messages message) {

}
