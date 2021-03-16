package cn.syutung.typechoapibysyutung.api.json

data class PagesJavaBean(
    val `data`: Data,
    val message: String,
    val status: String
){
    data class Data(
        val count: Int,
        val dataSet: List<DataSet>
    ){
        data class DataSet(
            val cid: String,
            val created: String,
            val slug: String,
            val title: String
        )
    }
}



