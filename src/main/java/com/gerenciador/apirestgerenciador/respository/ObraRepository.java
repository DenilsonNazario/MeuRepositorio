/**
 * @author denilson
 *
 */
package com.gerenciador.apirestgerenciador.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.apirestgerenciador.models.Obra;



public interface ObraRepository extends JpaRepository<Obra, Long> {
	
	List<Obra> findByNomeAndDescricao(String nome, String descricao);

}
