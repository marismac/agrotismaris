package com.agrotis.propriedade.model;

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
	private long idpropriedade;
	private long cnpj;
	private long idlaboratorio;
	@Size(min=0, max=1000)
	private String observacoes;
	

}
