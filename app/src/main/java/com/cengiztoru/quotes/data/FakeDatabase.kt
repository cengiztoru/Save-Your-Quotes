package com.cengiztoru.quotes.data


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

//Singleton
class FakeDatabase private constructor() {

    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile
        private var instance: FakeDatabase? = null //this variable is visible for other threats

        //if instance not null return instance else create instance
        fun getInstance() = instance
            ?: synchronized(this) {
                instance
                    ?: FakeDatabase().also { //check again, if instance not null return instance else create object and initialize instance by new object
                        instance = it
                    }
            }

    }

}