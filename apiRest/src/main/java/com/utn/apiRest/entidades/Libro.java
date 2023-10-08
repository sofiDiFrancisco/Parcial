package com.utn.apiRest.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Libro extends Base{

    @Column(name = "titulo")
    private String titulo;
    @Column (name = "genero")
    private String genero;
    @Column (name = "pagina")
    private int pagina;
    @Column (name = "fecha")
    private int fecha;

    @ManyToMany (cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
