package hyperwall.requestbody;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdminUIArcGISRequest {
    @JsonProperty
    private int layerID;

    @JsonProperty
    private String displayName;

    @JsonProperty
    private String description;

    @JsonProperty
    private String arcGISID;

    @JsonProperty
    private String fileType;
}
