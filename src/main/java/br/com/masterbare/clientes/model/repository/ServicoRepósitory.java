package br.com.masterbare.clientes.model.repository;

import br.com.masterbare.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepósitory extends JpaRepository<Servico, Integer> {
}
