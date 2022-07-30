package com.agrotis.propriedade.model;
import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Propriedade {
	@Id
	@Column( length = 14)
	private Long cnpj;
	@NotNull	
	private String nome;
}
