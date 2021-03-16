package cn.syutung.typechoapibysyutung.api

import cn.syutung.api.ArticlesApi
import cn.syutung.json.JavaBean
import cn.syutung.typechoapibysyutung.api.json.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Requests(val Url:String) {
    lateinit var q : Call<JavaBean?>;
    val retrofit = Retrofit.Builder().baseUrl(Url)
        .addConverterFactory(GsonConverterFactory.create()).build()
    val api = retrofit.create(ArticlesApi::class.java)
    fun requestsArticlelist(
        page: Int?,
        pageSize:Int?,
        filterType:String?,
        filterSlug:String?,
        showContent:Boolean?): Call<JavaBean?> {
        return api.getArticleList(
            page = page,pageSize = pageSize,filterSlug = filterSlug,filterType = filterType,showContent = showContent
        );
    }

    fun requestsPageslist(): Call<PagesJavaBean?> {
        return api.getPageList();
    }

    fun requestscategorieslist(): Call<FenLei?> {
        return api.getFenleiList();
    }

    fun requestsTAGlist(): Call<TAG?> {
        return api.getTagList();
    }

    fun requestsArticle(cid:Int?, slug:String?): Call<Post?> {
        return api.getArticleList(cid, slug);
    }

    fun requestsSetting(): Call<Settings?> {
        return api.getSttings();
    }

    fun requestsArchives(
        order:String?,showContent:Boolean?)
    : Call<Guidang?> {
        return api.getArchives(showContent, order);
    }

    fun requestsUsers(
        uid:Int?,name:String?)
            : Call<Users?> {
        return api.getUsers(uid, name);
    }

    fun requestsComments(
        page: Int?,
        pageSize:Int?,
        order:String?,
        cid: Int?,
        slug: String?): Call<Comments?> {
        return api.getComments(
            page = page,pageSize = pageSize,order = order,cid = cid,slug = slug
        );
    }
    fun requestsRecentComments(
        size:Int?): Call<Comment?> {
        return api.getResentlyComment(
            size = size
        );
    }
}

/***
 * .enqueue(object : Callback<JavaBean?> {
override fun onFailure(call: Call<JavaBean?>?, t: Throwable?) {

}
override fun onResponse(call: Call<JavaBean?>?, response: Response<JavaBean?>?) {
response.let { it ->
it?.body()?.let {
q = it
}
}
}
})
 ***/