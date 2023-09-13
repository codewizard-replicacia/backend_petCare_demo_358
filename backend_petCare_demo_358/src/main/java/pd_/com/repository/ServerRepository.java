package pd_.com.repository;


import pd_.com.model.Server;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ServerRepository extends SimpleJpaRepository<Server, String> {
    private final EntityManager em;
    public ServerRepository(EntityManager em) {
        super(Server.class, em);
        this.em = em;
    }
    @Override
    public List<Server> findAll() {
        return em.createNativeQuery("Select * from \"db\".\"Server\"", Server.class).getResultList();
    }
}