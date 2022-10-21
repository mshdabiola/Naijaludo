package com.mshdabiola.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mshdabiola.database.dao.LudoDao
import com.mshdabiola.database.model.LudoEntity
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LudoDaoTest {
    lateinit var ludoDao: LudoDao
    lateinit var db : LudoDatabase

    @Before
    fun before(){
        val content = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(content,LudoDatabase::class.java).build()
        ludoDao = db.getLudoDao()
    }
    @After
    fun after(){
        db.close()

    }

    @Test
    fun runInsert()= runBlocking{
        val l=LudoEntity()
        val id= ludoDao.upsert(l)

        delay(1000)
        val ludo = ludoDao.getOne(1).first()
        println("id is $ludo")
       Assert.assertEquals(ludo,l)
    }
}