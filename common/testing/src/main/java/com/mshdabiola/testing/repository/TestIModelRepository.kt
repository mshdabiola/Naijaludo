/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mshdabiola.testing.repository

import com.mshdabiola.data.repository.IModelRepository
import com.mshdabiola.model.Model
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

class TestIModelRepository : IModelRepository {

    /**
     * The backing hot flow for the list of topics ids for testing.
     */
    private val modelResourcesFlow: MutableSharedFlow<List<Model>> =
        MutableSharedFlow(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)

//    override fun getNewsResources(): Flow<List<NewsResource>> = newsResourcesFlow

//    override fun getNewsResources(filterTopicIds: Set<String>): Flow<List<NewsResource>> =
//        getNewsResources().map { newsResources ->
//            newsResources.filter {
//                it.topics.map(Topic::id).intersect(filterTopicIds).isNotEmpty()
//            }
//        }

    /**
     * A test-only API to allow controlling the list of news resources from tests.
     */
//    fun sendNewsResources(newsResources: List<NewsResource>) {
//        newsResourcesFlow.tryEmit(newsResources)
//    }



    override suspend fun insert(model: Model) {
        TODO("Not yet implemented")
    }

    override fun getAllModel(): Flow<List<Model>> {
        TODO("Not yet implemented")
    }

    override suspend fun updateModel(name: String, id: Long) {
        TODO("Not yet implemented")
    }

    override fun getOneModel(id: Long): Flow<Model> {
        TODO("Not yet implemented")
    }

    override suspend fun delete(id: Long) {
        TODO("Not yet implemented")
    }

}
