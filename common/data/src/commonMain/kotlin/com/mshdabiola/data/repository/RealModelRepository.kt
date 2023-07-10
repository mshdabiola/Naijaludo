package com.mshdabiola.data.repository

import com.mshabiola.database.dao.modeldao.IModelDao
import com.mshdabiola.model.Model
import kotlinx.coroutines.flow.Flow

internal class RealModelRepository constructor(
    private val modelDao: IModelDao,
) : IModelRepository {
    override suspend fun insert(model: Model) {
        modelDao.insert(model)
    }

    override fun getAllModel(): Flow<List<Model>> {
        return modelDao.getAllModel()
    }

    override suspend fun updateModel(name: String, id: Long) {
        modelDao.updateModel(name, id)
    }

    override fun getOneModel(id: Long): Flow<Model> {
       return modelDao.getOneModel(id)
    }

    override suspend fun delete(id: Long) {
        modelDao.delete(id)
    }

}
