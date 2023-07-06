package com.mshdabiola.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode

internal class NetworkDataSource constructor(
    private val httpClient: HttpClient,
) : INetworkDataSource {

    override suspend fun getRecommendation(): List<String> {
//        val response = httpClient.get(
//            Request.Recommendations(
//                limit = "10",
//                market = "NG",
//                seed_artists = "4NHQUGzhtTLFvgF5SZesLK",
//                seed_genres = "classical",
//                seed_tracks = "0c6xIDDpzE81m2q797ordA"
//            )
//        )
//        val netWorkTracks: PagingNetWorkTracks = if (response.status == HttpStatusCode.OK) {
//            response.body()
//        } else {
//            val message: Message = response.body()
//            throw Exception(message.error.message)
//        }
//
//
//        return netWorkTracks.tracks
//    }
        TODO()
    }

    override suspend fun goToGoogle() :String{
        val response = httpClient.get("http://www.google.com")
        val string:String = if (response.status == HttpStatusCode.OK) {
            response.body()
        } else {

            throw Exception("Error occur")
        }


        return string

    }

}







