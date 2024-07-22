package chat.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chat.entities.Users;

@Repository
public interface UsersRespository extends JpaRepository<Users, UUID> {

}
