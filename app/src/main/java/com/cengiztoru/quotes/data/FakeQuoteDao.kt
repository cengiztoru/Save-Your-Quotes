package com.cengiztoru.quotes.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

class FakeQuoteDao {
    //ENCAPSULATION
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>


}