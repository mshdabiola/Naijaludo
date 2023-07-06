package com.mshabiola.database.di

import android.util.Log
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.mshabiola.database.util.Constant
import com.mshdabiola.database.TempDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

actual val databaseModule: Module
    get() = module {
        single {
            val driver =AndroidSqliteDriver(
                schema = TempDatabase.Schema,
                context = get (),
                name = Constant.databaseName
            )


            Log.e("version","version ${TempDatabase.Schema.version}")

            TempDatabase(driver)
        }
        includes(daoModules)
    }