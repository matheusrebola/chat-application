package chat.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chat.entities.EncryptionKeys;

@Repository
public interface EncryptionKeysRepository extends JpaRepository<EncryptionKeys, UUID> {

}
