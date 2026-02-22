package orange_team.chatting.DomainObjects.Repositorys;
import orange_team.chatting.DomainObjects.*;

import org.springframework.data.repository.CrudRepository;

public interface PosterRepo extends CrudRepository<Poster, String>{
    Poster findByIdName(String id_name);

    
}
