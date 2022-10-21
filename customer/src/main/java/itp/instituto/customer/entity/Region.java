package itp.instituto.customer.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

@Data
@Entity
@Table(name="tbl_regions")
public class Region implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id" , unique = true ,length = 8, nullable = false, insertable = false, updatable = false)
	private String numberID;


	@Column(name="name", nullable=false)
	private String regionName;

}
