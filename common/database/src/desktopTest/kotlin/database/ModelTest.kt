package database

import app.cash.turbine.test
import com.mshabiola.database.dao.modeldao.ModelDao
import com.mshdabiola.model.Model
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.koin.core.component.inject
import kotlin.test.assertEquals

@OptIn(ExperimentalCoroutinesApi::class)
class ModelTest :AbstractTest() {

    override fun insert() = runTest{
        val modelDao by inject<ModelDao>()

        modelDao.insert(Model(2,"ai"))
        modelDao.getAllModel()
            .test {
                val list=awaitItem()
                print(list)
                assertEquals(1,list.size)
                this.cancelAndIgnoreRemainingEvents()
            }
    }

    override fun delete() {
    }

    override fun getOne() {
    }

    override fun getAll() {
    }


}