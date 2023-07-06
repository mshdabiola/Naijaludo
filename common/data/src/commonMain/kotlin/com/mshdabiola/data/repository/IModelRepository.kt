package com.mshdabiola.data.repository


import com.mshdabiola.model.Model
import kotlinx.coroutines.flow.Flow

interface IModelRepository {

    suspend fun insert(model: Model)

    fun getAllModel():Flow<List<Model>>

    suspend fun updateModel(name: String, id: Long)
    fun getOneModel(id: Long):Flow<Model>
    suspend fun delete(id: Long)

}
