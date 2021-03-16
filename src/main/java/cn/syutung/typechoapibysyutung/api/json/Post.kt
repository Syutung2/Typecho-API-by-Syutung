package cn.syutung.typechoapibysyutung.api.json

data class Post(
    val `data`: Data,
    val message: String,
    val status: String
){
    data class Data(
        val categories: List<Category>,
        val category: String,
        val cid: String,
        val commentsNum: String,
        val created: String,
        val csrfToken: String,
        val date: Date,
        val day: String,
        val directory: List<String>,
        val feedAtomUrl: String,
        val feedRssUrl: String,
        val feedUrl: String,
        val fields: Fields,
        val hidden: Boolean,
        val isMarkdown: Boolean,
        val month: String,
        val pathinfo: String,
        val permalink: String,
        val slug: String,
        val text: String,
        val type: String,
        val year: String
    ){
        data class Category(
            val cid: String,
            val count: String,
            val description: String,
            val directory: List<String>,
            val feedAtomUrl: String,
            val feedRssUrl: String,
            val feedUrl: String,
            val mid: String,
            val name: String,
            val order: String,
            val parent: String,
            val permalink: String,
            val slug: String,
            val type: String
        )
        data class Date(
            val timeStamp: Int
        )
        data class Fields(
            val banner: Banner,
            val commentShow: CommentShow,
            val excerpt: Excerpt,
            val meta: Meta
        ){
            data class Banner(
                val name: String,
                val type: String,
                val value: String
            )

            data class CommentShow(
                val name: String,
                val type: String,
                val value: String
            )

            data class Excerpt(
                val name: String,
                val type: String,
                val value: String
            )

            data class Meta(
                val name: String,
                val type: String,
                val value: String
            )
        }
    }

}







