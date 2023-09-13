package pd_.com.function;

import pd_.com.model.BuildTool;
import pd_.com.model.FrontendApp;
import pd_.com.model.Architecture;
import pd_.com.model.Server;
import pd_.com.model.PackageManagement;
import pd_.com.model.FrontendScreen;
import pd_.com.model.Project;




import pd_.com.model.complex.BasicDetails;
import pd_.com.model.complex.AdvancedDetails;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  