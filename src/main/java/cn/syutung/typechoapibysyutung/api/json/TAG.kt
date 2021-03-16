package cn.syutung.typechoapibysyutung.api.json

data class TAG(
    val `data`: List<Data>,
    val message: String,
    val status: String
){
    data class Data(
        val count: String,
        val description: Any,
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
}

