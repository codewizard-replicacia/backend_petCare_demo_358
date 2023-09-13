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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import pd_.com.repository.PackageManagementRepository;
import pd_.com.repository.ProjectRepository;
import pd_.com.repository.ArchitectureRepository;
import pd_.com.repository.ServerRepository;
import pd_.com.repository.FrontendScreenRepository;
import pd_.com.repository.BuildToolRepository;
import pd_.com.repository.FrontendAppRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
