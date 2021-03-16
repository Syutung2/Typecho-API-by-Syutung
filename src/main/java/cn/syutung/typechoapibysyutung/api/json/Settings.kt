package cn.syutung.typechoapibysyutung.api.json

 data class Settings(
    val `data`: Data,
    val message: String,
    val status: String
){
     data class Data(
         val description: String,
         val keywords: String,
         val timezone: String,
         val title: String
     )
 }