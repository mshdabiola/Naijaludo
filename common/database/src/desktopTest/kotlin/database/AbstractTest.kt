package database

import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import com.mshabiola.database.di.daoModules
import com.mshdabiola.database.TempDatabase
import org.junit.Rule
import org.junit.Test
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule

abstract class AbstractTest : KoinTest {

    @get:Rule
    val koinTestRule = KoinTestRule.create {
        val module = module {
            single {
                val driver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
                    .also { TempDatabase.Schema.create(it) }

                TempDatabase(driver)
            }

        }
        // Your KoinApplication instance here
        modules(module, daoModules)

    }

    @Test
    abstract fun insert()

     @Test
     abstract fun delete()

     @Test
     abstract fun getOne()

     @Test
     abstract fun getAll()


 }