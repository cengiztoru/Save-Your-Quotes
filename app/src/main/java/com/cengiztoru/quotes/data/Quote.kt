package com.cengiztoru.quotes.data


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

data class Quote(
    val quoteText: String,
    val author: String
) {
    override fun toString(): String {
        return "$quoteText - $author \n"
    }
}