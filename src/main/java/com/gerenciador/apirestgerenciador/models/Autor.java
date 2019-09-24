
package com.gerenciador.apirestgerenciador.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import javassist.expr.NewArray;

@Entity
public class Autor implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull(message="O 'Nome'não pode ser nulo.")
	private String nome;

	private int sexo;
	

	private String email;
	@NotNull(message="O 'dt_nascimento'não pode ser nulo.")
	private Date dt_nascimento;
	@NotNull(message="O campo 'Pais' não pode ser nulo.")
	private String pais;

	private String cpf;
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date dt_cadastro;

    @ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(name = "Autor_Obra",
        joinColumns = @JoinColumn(name = "autor_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "obra_id", referencedColumnName = "id"))
	private List<Obra> listaObras = new ArrayList<Obra>();
	
	public Autor() {}
	
	
	public Autor(Long id, String nome, int sexo, String email, Date dt_nascimento, String pais, String cpf, 
			Date dt_cadastro, List<Obra> lista) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.dt_nascimento = dt_nascimento;
		this.pais = pais;
		this.cpf = cpf;
		this.dt_cadastro = dt_cadastro;
		this.listaObras = lista;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	public List<Obra> getListaObras() {
		return listaObras;
	}
	public void setListaObras(List<Obra> listaObras) {
		this.listaObras = listaObras;
	}
	
	
	
	
	
	

}
