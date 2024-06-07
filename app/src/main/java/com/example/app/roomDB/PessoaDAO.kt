package com.example.app.roomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

//Configuras funções disponiveis que seriam inserir e deletar, alem de ter a opção de listar todas as pessoas que estão cadastradas.
@Dao
interface PessoaDAO {

    //Inserir
    @Upsert
    suspend fun upsertPessoa(pessoa: Pessoa)

    //Deletar
    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)

    //Listar
    @Query("SELECT * FROM pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>>
}