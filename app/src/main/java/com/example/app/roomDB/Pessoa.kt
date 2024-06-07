package com.example.app.roomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

//Cria a tabela e as variaveis que serão adicionados os dados cadastrados
//Contendo o seu id inicial igual a 0 para não ocorrer risco de quando adicionar algum registro ele ser deste valor inicial

@Entity
data class Pessoa(
    val nome: String,
    val telefone: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
