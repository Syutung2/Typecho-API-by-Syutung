package cn.syutung.typechoapibysyutung.api.json

data class Comment(
    val `data`: Data,
    val message: String,
    val status: String
){
    data class Data(
        val count: Int,
        val dataSet: List<DataSet>
    ){
        data class DataSet(
            val author: String,
            val cid: String,
            val coid: String,
            val text: String
        )
    }
}



