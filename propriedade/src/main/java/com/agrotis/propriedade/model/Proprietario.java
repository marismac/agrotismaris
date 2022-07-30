package com.agrotis.propriedade.model;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Proprietario {
	@Id
	@NotNull	
	@Column( length = 40)
	private String nome;
	@NotNull
	private LocalDateTime dataInicial;
	@NotNull
	private LocalDateTime dataFinal;
	
	private long cnpj_propriedade;
	private long cd_laboratorio;
	@Size(min=0, max=1000)
	private String observacoes;
	

}
