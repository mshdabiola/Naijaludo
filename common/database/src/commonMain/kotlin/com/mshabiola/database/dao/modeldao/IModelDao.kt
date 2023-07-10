package com.mshabiola.database.dao.modeldao

import com.mshdabiola.model.Model
import kotlinx.coroutines.flow.Flow

interface IModelDao {

    suspend fun insert(modelEntity: Model)

    fun getAllModel():Flow<List<Model>>

    suspend fun updateModel(name: String, id: Long)
    fun getOneModel(id: Long):Flow<Model>
   suspend fun delete(id: Long)
}