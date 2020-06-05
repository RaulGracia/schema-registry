/*
 * Pravega Schema Registry APIs
 * REST APIs for Pravega Schema Registry.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.pravega.schemaregistry.contract.generated.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.pravega.schemaregistry.contract.generated.rest.model.VersionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;

/**
 * Map of Group names to versionInfos in the group. This is for all the groups where the schema is registered.
 */
@ApiModel(description = "Map of Group names to versionInfos in the group. This is for all the groups where the schema is registered.")

public class AddedTo   {
  @JsonProperty("groups")
  private Map<String, VersionInfo> groups = new HashMap<String, VersionInfo>();

  public AddedTo groups(Map<String, VersionInfo> groups) {
    this.groups = groups;
    return this;
  }

  public AddedTo putGroupsItem(String key, VersionInfo groupsItem) {
    this.groups.put(key, groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @JsonProperty("groups")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Map<String, VersionInfo> getGroups() {
    return groups;
  }

  public void setGroups(Map<String, VersionInfo> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddedTo addedTo = (AddedTo) o;
    return Objects.equals(this.groups, addedTo.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddedTo {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
