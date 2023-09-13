package pd_.com.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import pd_.com.model.BuildTool;
import pd_.com.model.FrontendApp;
import pd_.com.model.Architecture;
import pd_.com.model.Server;
import pd_.com.model.PackageManagement;
import pd_.com.model.FrontendScreen;
import pd_.com.model.Project;
import pd_.com.model.complex.BasicDetails;
import pd_.com.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppSelectedScreenIds")
@Table(schema = "\"db\"", name = "\"FrontendAppSelectedScreenIds\"")
@Data
public class FrontendAppSelectedScreenIds{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"SelectedScreenIds\"")
    private Long selectedScreenIds;
}