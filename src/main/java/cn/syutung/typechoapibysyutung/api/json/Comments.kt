package cn.syutung.typechoapibysyutung.api.json

data class Comments(
    val `data`: Data,
    val message: String,
    val status: String
){
    data class Data(
        val count: Int,
        val dataSet: List<DataSet>,
        val page: Int,
        val pageSize: Int,
        val pages: Int
    ){
        data class DataSet(
            val author: String,
            val children: List<Any>,
            val cid: String,
            val coid: String,
            val created: String,
            val mailHash: String,
            val parent: String,
            val status: String,
            val text: String,
            val url: String
        )
    }
}



