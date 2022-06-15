package br.com.masterbare.clientes.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data // -> Cria os getters e setters, equals, hashCode e toString
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // deixa a cargo do banco criar o autoincremento
    private Integer id;

    @Column(nullable = false, length = 150) // o nome do usuário será not null e  com tamanho de 150
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

}
