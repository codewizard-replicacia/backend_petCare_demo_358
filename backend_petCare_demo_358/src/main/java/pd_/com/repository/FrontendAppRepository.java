package pd_.com.repository;


import pd_.com.model.FrontendApp;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class FrontendAppRepository extends SimpleJpaRepository<FrontendApp, String> {
    private final EntityManager em;
    public FrontendAppRepository(EntityManager em) {
        super(FrontendApp.class, em);
        this.em = em;
    }
    @Override
    public List<FrontendApp> findAll() {
        return em.createNativeQuery("Select * from \"db\".\"FrontendApp\"", FrontendApp.class).getResultList();
    }
}