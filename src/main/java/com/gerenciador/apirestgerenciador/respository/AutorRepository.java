/**
 * @author denilson
 *
 */
package com.gerenciador.apirestgerenciador.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.apirestgerenciador.models.Autor;



public interface AutorRepository extends JpaRepository<Autor, Long>{
	
	Optional<Autor> findByEmail(String email);
	
	
	

}
