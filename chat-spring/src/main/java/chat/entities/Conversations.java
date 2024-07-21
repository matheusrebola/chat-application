package chat.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Conversations(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		ConversationType conversationType,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
