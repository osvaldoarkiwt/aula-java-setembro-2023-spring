package com.projeto.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name="pessoas")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pessoa_id")
	private Long id;
	@Column(name="pessoa_nome")
	private String nome;
	@Column(name="pessoa_endereco")
	private String endereco;
	
}
