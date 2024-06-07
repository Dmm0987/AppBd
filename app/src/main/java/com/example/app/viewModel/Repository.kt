package com.example.app.viewModel

import com.example.app.roomDB.Pessoa
import com.example.app.roomDB.PessoaDataBase

//Linka as funções disponiveis já criadas no PESSOADAO com o Banco de dados

class Repository(private val db: PessoaDataBase) {
    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDAO().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDAO().deletePessoa(pessoa)
    }
    fun getAllPessoa() = db.pessoaDAO().getAllPessoa()

}