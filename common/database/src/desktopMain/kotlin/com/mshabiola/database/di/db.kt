package com.mshabiola.database.di

import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import com.mshdabiola.database.TempDatabase

fun withDatabase(path: String): JdbcSqliteDriver {
	return JdbcSqliteDriver("jdbc:sqlite:$path").apply {
		migrateIfNeeded(this)
	}

}

private const val versionPragma = "user_version"

fun migrateIfNeeded(driver: JdbcSqliteDriver) {
	val oldVersion =
		driver.executeQuery(null, "PRAGMA $versionPragma", parameters = 0, mapper = {cursor->
			if (cursor.next()) {
				cursor.getLong(0)?.toInt()
			} else {
				null
			}
		}).value ?: 0



	val newVersion = TempDatabase.Schema.version

	if (oldVersion == 0) {
		println("Creating DB version $newVersion!")
		TempDatabase.Schema.create(driver)
		driver.execute(null, "PRAGMA $versionPragma=$newVersion", 0)
	} else if (oldVersion < newVersion) {
		println("Migrating DB from version $oldVersion to $newVersion!")
		TempDatabase.Schema.migrate(driver, oldVersion, newVersion)
		driver.execute(null, "PRAGMA $versionPragma=$newVersion", 0)
	}
}
