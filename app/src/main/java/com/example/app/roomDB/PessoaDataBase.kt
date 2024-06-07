package com.example.app.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase

//Cria o bd definindo as suas entidades envolvidas e a sua versão

@Database(
    entities = [Pessoa::class],
    version = 1
)

//Cria uma classe abstrata, que não pode ser substituida e guarda métodos que serão usados

abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDAO(): PessoaDAO
}