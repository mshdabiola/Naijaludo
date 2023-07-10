package com.mshabiola.database.model

import com.mshdabiola.database.TempDatabase
import com.mshdabiola.model.Model
import commshdabioladatabase.tables.ModelEntity


fun ModelEntity.toModel()=Model(id, name)


fun Model.toEntity()=ModelEntity(id, name,7)