package com.mshabiola.database.dao.modeldao

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import app.cash.sqldelight.coroutines.mapToOne
import com.mshabiola.database.model.toEntity
import com.mshabiola.database.model.toModel
import com.mshdabiola.model.Model
import commshdabioladatabase.tables.ModelQueries
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

 class ModelDao(private val modelQueries: ModelQueries,
               private val coroutineDispatcher:CoroutineDispatcher) : IModelDao {
    override suspend fun insert(modelEntity: Model) {
        withContext(coroutineDispatcher){
            modelQueries.insertFullModelObject(modelEntity.toEntity())
        }

    }

    override fun getAllModel(): Flow<List<Model>> {
        return modelQueries.selectAllModel()
            .asFlow()
            .mapToList(coroutineDispatcher)
            .map { it.map { it.toModel() } }
    }

    override suspend fun updateModel(name:String, id:Long) {
        withContext(coroutineDispatcher) {
            modelQueries.updateByName(name, id)
        }
    }

    override fun getOneModel(id: Long): Flow<Model> {
        return modelQueries.selectWIthId(id)
            .asFlow()
            .mapToOne(coroutineDispatcher)
            .map { it.toModel() }
    }

    override suspend fun delete(id: Long) {
        withContext(coroutineDispatcher){
            modelQueries.deleteById(id)
        }

    }

}