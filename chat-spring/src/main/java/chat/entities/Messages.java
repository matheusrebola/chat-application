package chat.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Messages(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		MessageType messageType,
		ContentType contentType,
		String content,
		LocalDateTime createdAt,
		Conversations conversation,
		Users user) {

}
