package cn.syutung.typechoapibysyutung.api

import cn.syutung.json.JavaBean
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main(){
    val myre = Requests("https://we-chat.cn/")
    myre.requestsArticlelist(
        null,null,null,null,null
    ).enqueue(object : Callback<JavaBean?> {
        override fun onFailure(call: Call<JavaBean?>?, t: Throwable?) {

        }
        override fun onResponse(call: Call<JavaBean?>?, response: Response<JavaBean?>?) {
            response.let { it ->
                it?.body()?.let {
                    println(
                        it.data
                    )
                }
            }
        }
    })

}