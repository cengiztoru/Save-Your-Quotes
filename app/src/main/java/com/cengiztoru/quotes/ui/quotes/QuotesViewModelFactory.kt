package com.cengiztoru.quotes.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cengiztoru.quotes.data.QuoteRepository


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

@Suppress("UNCHECKED_CAST")
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}