package methods-backend;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class methods backendConfiguration extends Configuration {
    // TODO: implement service configuration
    @NotEmpty
    private String template;

    @NotEmpty
    private String defualtGenes = "You Have no genes in our database. Import them now by clicking the import button!";

    @NotEmpty
    private String defualtFamilyName = "Define Your Name with import!";

    @NotEmpty
    private String defualtUserName = "Stranger";

    @JsonProperty
    public void getdefualtUserName() {
        return defualtUserName;
    }

    @JsonProperty
    public String getTemplate(){
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public void getDefualtGenes() {
        return defualtGenes;
    }

    @JsonProperty
    public void setDefualtGenes(String genes) {
        this.defualtGenes = genes;
    }
