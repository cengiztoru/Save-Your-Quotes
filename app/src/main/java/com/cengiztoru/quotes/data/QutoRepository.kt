package com.cengiztoru.quotes.data


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

class QutoRepository private constructor(private val quoteDao: FakeQuoteDao) {
    fun addQutoe(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQutoes() = quoteDao.getQuotes()

    companion object {
        @Volatile
        private var instance: QutoRepository? = null //this variable is visible for other threats

        fun getInstance(quoteDao: FakeQuoteDao) = instance
            ?: synchronized(this) { //if intance not null return instance else create instance
                instance ?: QutoRepository(quoteDao).also {
                    instance = it
                }   //check again, if instance not null return instance else create object and initialize instance by new object
            }

    }
}