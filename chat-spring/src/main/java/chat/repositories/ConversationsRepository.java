package chat.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chat.entities.Conversations;

@Repository
public interface ConversationsRepository extends JpaRepository<Conversations, UUID> {

}
