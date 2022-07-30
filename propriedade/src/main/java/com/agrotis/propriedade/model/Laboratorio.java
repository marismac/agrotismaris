package com.agrotis.propriedade.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Entity
public class Laboratorio {

	@Id	
	private Long codigo;
	@NotNull	
	private String nome;
}
