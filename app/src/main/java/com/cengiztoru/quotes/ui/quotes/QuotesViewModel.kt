package com.cengiztoru.quotes.ui.quotes

import androidx.lifecycle.ViewModel
import com.cengiztoru.quotes.data.Quote
import com.cengiztoru.quotes.data.QuoteRepository


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {
    fun getQuotes() = quoteRepository.getQutoes()

    fun addQuote(quote: Quote) = quoteRepository.addQutoe(quote)

}