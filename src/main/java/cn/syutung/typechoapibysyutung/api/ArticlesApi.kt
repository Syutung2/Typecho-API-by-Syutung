package cn.syutung.api

import cn.syutung.json.JavaBean
import cn.syutung.typechoapibysyutung.api.json.*
import com.google.gson.JsonObject
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


interface ArticlesApi {


    @GET("api/posts")  //文章列表
    fun getArticleList(
        @Query("page") page:Int?,
        @Query("pageSize") pageSize:Int?,
        @Query("filterType") filterType:String?,
        @Query("filterSlug") filterSlug:String?,
        @Query("filterSlug") showContent:Boolean?
        ): retrofit2.Call<JavaBean?>


    @GET("api/pages")  //文章列表
    fun getPageList(): retrofit2.Call<PagesJavaBean?>

    @GET("api/categories")  //文章列表
    fun getFenleiList(): retrofit2.Call<FenLei?>

    @GET("api/tags")
    fun getTagList(): retrofit2.Call<TAG?>

    @GET("api/settings")
    fun getSttings(): retrofit2.Call<Settings?>

    @GET("api/users")
    fun getUsers(
        @Query("uid") uid:Int?,
        @Query("name") name:String?
    ): retrofit2.Call<Users?>
    @GET("api/archives")
    fun getArchives(
        @Query("showContent") showContent:Boolean?,
        @Query("order") order:String?
    ): retrofit2.Call<Guidang?>

    @GET("api/post")  //文章列表
    fun getArticleList(
        @Query("cid") cid:Int?,
        @Query("slug") slug:String?
    ): retrofit2.Call<Post?>

    @GET("api/comments")
    fun getComments(
        @Query("page") page:Int?,
        @Query("pageSize") pageSize:Int?,
        @Query("order") order:String?,
        @Query("cid") cid:Int?,
        @Query("slug") slug:String?
    ): retrofit2.Call<Comments?>

    @GET("api/recentComments")  //文章列表
    fun getResentlyComment(
        @Query("size") size:Int?
    ): retrofit2.Call<Comment?>

}