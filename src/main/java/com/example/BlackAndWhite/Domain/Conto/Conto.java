package com.example.BlackAndWhite.Domain.Conto;

import jakarta.persistence.*;
import lombok.*;

@Table(name="conto")
@Entity(name="conto")
@EqualsAndHashCode(of="contoID")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="conto_id")
    private String contoID;

    @Column(name="titulo")
    private String titulo;

    @Column(name="conto")
    private String conto;

     public String toString() {;
        return "Conto{" + "titulo=" + titulo + '\'' + ", conto=" + conto + "}";
    }

    public Conto(ContoDTO dto){
        this.titulo = dto.titulo();
        this.conto = dto.conto();
    }
    
}