package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Indica que a classe é uma entidade (necessário chave primária)
@Data //Automaticamente insere um Getter e um Setter
@Builder //Construção de projetos
@AllArgsConstructor //Insere os construtores
@NoArgsConstructor //Insere os construtores
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Incremental
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) //Criar uma constraint de BD
    private PhoneType type;

    @Column(nullable = false)
    private String number;


}
