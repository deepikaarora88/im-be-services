package org.egov.im.web.models.user;

import java.util.Collections;
import java.util.List;

import org.egov.im.web.models.RequestInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSearchRequest {

	@JsonProperty("RequestInfo")
	private RequestInfo requestInfo;

	@JsonProperty("uuid")
	private List<String> uuid;

	@JsonProperty("id")
	private List<String> id;

	 
    @JsonProperty("tenantId")
    private String tenantId = null;
	 
	@JsonProperty("userName")
	private String userName;

	@JsonProperty("name")
	private String name;

	@JsonProperty("mobileNumber")
	private String mobileNumber;

	@JsonProperty("aadhaarNumber")
	private String aadhaarNumber;

	@JsonProperty("pan")
	private String pan;

	@JsonProperty("emailId")
	private String emailId;

	@JsonProperty("fuzzyLogic")
	private boolean fuzzyLogic;

	@JsonProperty("active")
	@Setter
	private Boolean active;


	@JsonProperty("pageSize")
	private int pageSize;

	@JsonProperty("pageNumber")
	private int pageNumber = 0;

	@JsonProperty("sort")
	private List<String> sort = Collections.singletonList("name");

	@JsonProperty("userType")
	private String userType;

	@JsonProperty("roleCodes")
	private List<String> roleCodes;


}
