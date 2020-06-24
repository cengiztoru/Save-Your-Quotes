package com.cengiztoru.quotes.utils

import com.cengiztoru.quotes.data.FakeDatabase
import com.cengiztoru.quotes.data.QuoteRepository
import com.cengiztoru.quotes.ui.quotes.QuotesViewModelFactory


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}