package com.example.CROUD.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

@Entity(name = "livro")
data class Livro(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @field: NotBlank
    @field: NotNull
    @field: Size(min = 3, max = 75)
    @Column
    var titulo: String,



//    @field: NotBlank
//    @field: NotNull
    @Column
    var valor: Double?,

//    @field: NotNull
//    @field: NotBlank
    @Column
    var anoPublicacao: Int?,

    @Column
    var paginas: Int?,

    @Column
    var descricao: String,

    @Column
    var linguagens: List<String>?,



    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "livro_id")
    var autores: List<Autor>?
)