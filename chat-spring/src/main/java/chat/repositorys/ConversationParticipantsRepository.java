package chat.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chat.entities.ConversationParticipants;

@Repository
public interface ConversationParticipantsRepository extends JpaRepository<ConversationParticipants, UUID> {

}
