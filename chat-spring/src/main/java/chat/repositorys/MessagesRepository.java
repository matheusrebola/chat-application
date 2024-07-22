package chat.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chat.entities.Messages;

@Repository
public interface MessagesRepository extends JpaRepository<Messages, UUID> {

}
