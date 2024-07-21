package chat.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Users(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String username,
		String passwordhash,
		String email,
		String profilePicture,
		StatusUser statusUser,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {

}
