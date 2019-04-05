package com.cristianalfaro.pelidex

import android.net.Uri
import java.io.IOException
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.*

class NetworsUtils {

    val MOVIES_API_BASEURL = "http://www.omdbapi.com/"
    val TOKEN_API = "8135618f"

    fun buildtSearchURl(movieName: String) : URL {
        val builtUri = Uri.parse(MOVIES_API_BASEURL)
        .buildUpon()
        .appendQueryParameter("apikey", TOKEN_API)
        .appendQueryParameter("t", movieName)
        .build()

        return try {
            URL(builtUri.toString())
        } catch (e: MalformedURLException){
            URL("")
        }
    }

    @Throws(IOException::class)
    fun getResponseFormHttpUrl ( url: URL): String{
        val urlConnection = url.openConnection() as HttpURLConnection
        try{
            val `in` = urlConnection.inputStream

            val scanner = Scanner(`in`)
            scanner.useDelimiter("\\A")

            val
        }
    }

}