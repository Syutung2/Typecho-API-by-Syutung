package cn.syutung.typechoapibysyutung.api.json

data class Guidang(
    val `data`: Data,
    val message: String,
    val status: String
){
    data class Data(
        val count: Int,
        val dataSet: DataSet
    ){
        data class DataSet(
            val `2021`: X2021
        ){
            data class X2021(
                val `02`: List<X02>,
                val `03`: List<X03>
            ){
                data class X02(
                    val categories: List<Category>,
                    val category: String,
                    val cid: String,
                    val created: String,
                    val date: Date,
                    val day: String,
                    val directory: List<String>,
                    val feedAtomUrl: String,
                    val feedRssUrl: String,
                    val feedUrl: String,
                    val fields: Fields,
                    val hidden: Boolean,
                    val isMarkdown: Boolean,
                    val modified: String,
                    val month: String,
                    val pathinfo: String,
                    val permalink: String,
                    val slug: String,
                    val title: String,
                    val type: String,
                    val year: String
                ){
                    data class CategoryX(
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

                    data class DateX(
                        val timeStamp: Int
                    )

                    data class FieldsX(
                        val banner: BannerX,
                        val commentShow: CommentShowX,
                        val excerpt: ExcerptX,
                        val meta: MetaX
                    ){
                        data class BannerX(
                            val name: String,
                            val type: String,
                            val value: String
                        )

                        data class CommentShowX(
                            val name: String,
                            val type: String,
                            val value: String
                        )

                        data class ExcerptX(
                            val name: String,
                            val type: String,
                            val value: String
                        )

                        data class MetaX(
                            val name: String,
                            val type: String,
                            val value: String
                        )
                    }



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

                data class X03(
                    val categories: List<CategoryX>,
                    val category: String,
                    val cid: String,
                    val created: String,
                    val date: DateX,
                    val day: String,
                    val directory: List<String>,
                    val feedAtomUrl: String,
                    val feedRssUrl: String,
                    val feedUrl: String,
                    val fields: FieldsX,
                    val hidden: Boolean,
                    val isMarkdown: Boolean,
                    val modified: String,
                    val month: String,
                    val pathinfo: String,
                    val permalink: String,
                    val slug: String,
                    val title: String,
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

                    data class CategoryX(
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

                    data class DateX(
                        val timeStamp: Int
                    )

                    data class FieldsX(
                        val banner: BannerX,
                        val commentShow: CommentShowX,
                        val excerpt: ExcerptX,
                        val meta: MetaX
                    ){
                        data class BannerX(
                            val name: String,
                            val type: String,
                            val value: String
                        )

                        data class CommentShowX(
                            val name: String,
                            val type: String,
                            val value: String
                        )

                        data class ExcerptX(
                            val name: String,
                            val type: String,
                            val value: String
                        )

                        data class MetaX(
                            val name: String,
                            val type: String,
                            val value: String
                        )
                    }


                }

            }
        }
    }
}











