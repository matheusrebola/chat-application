package chat.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chat.entities.MessageHistory;

@Repository
public interface MessageHistoryRepository extends JpaRepository<MessageHistory, UUID> {

}
