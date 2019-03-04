package com.ashwin.officeproject.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "office")
public class Office {
	 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long officeId;
	
	@NotEmpty(message = "{officeName.notempty}")
    private String officeName;
	 
    
	@NotNull(message="{officeNumber.null}")
    @Min(value=2,message="{officeNumber.min}")
    @Max(value=10,message="{officeNumber.max}")
    private Long officeNumber;
	 
	
	@NotEmpty(message = "{officeName.address}")
    private String officeAddress;
 
    public Office() {
 
    }

	public Long getOfficeId() {
		return officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	
	public Long getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(Long officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
 
   
 
}