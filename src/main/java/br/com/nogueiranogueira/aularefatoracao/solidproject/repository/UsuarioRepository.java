package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    long countByTipo(String tipo);

}
