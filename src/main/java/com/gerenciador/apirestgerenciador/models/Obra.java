/**
 * @author Denilson Nazário
 *
 */
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
import javax.validation.constraints.Size;

@Entity
public class Obra implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull(message="O campo 'Nome' não pode ser nulo.")
	private String nome;

	@Size(max=240)
	@NotNull(message="O campo 'Descricao' não pode ser nulo.")
	private String descricao; //nome descricao dt_public dt_exposi listaAutores

	private Date dt_public;

	private Date dt_exposi;
	@NotNull(message="Cada obra deve ser vinculada a pelo menos 1 autor.")

    /*@ManyToMany(fetch= FetchType.LAZY)
    @JoinTable(name = "Obra_autor",
        joinColumns = @JoinColumn(name = "obra_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "autor_id", referencedColumnName = "id"))
	private List<Autor> listaAutores = new ArrayList<Autor>();*/
	

	public Obra() {
		
	}
	
	public Obra(Long id,String nome ,String descricao, Date dt_pubic, Date dt_exposi/*,List<Autor> lista*/ ) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.dt_public = dt_pubic;
		this.dt_exposi = dt_exposi;
		//this.listaAutores = lista;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDt_public() {
		return dt_public;
	}
	public void setDt_public(Date dt_public) {
		this.dt_public = dt_public;
	}
	public Date getDt_exposi() {
		return dt_exposi;
	}
	public void setDt_exposi(Date dt_exposi) {
		this.dt_exposi = dt_exposi;
	}
//	public List<Autor> getListaAutores() {
	//	return listaAutores;
//	}
//	public void setListaAutores(List<Autor> listaAutores) {
//		this.listaAutores = listaAutores;
//	}
	
	
	
	

}
