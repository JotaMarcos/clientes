package br.com.masterbare.clientes.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data // -> Cria os getters e setters, equals, hashCode e toString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // deixa a cargo do banco criar o autoincremento
    private Integer id;

    @Column(nullable = false, length = 150) // o nome do usuário será not null e  com tamanho de 150
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "data_cadastro", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @PrePersist
    public void perPersist(){
        setDataCadastro(LocalDate.now());
    }

}
