package com.cengiztoru.quotes.data


/**     Code With 💗
 * Created by Cengiz TORU
 * cengiztoru@gmail.com
 */

//Singleton
class FakeDatabase private constructor() {
    companion object {
        @Volatile
        private var instance: FakeDatabase? = null //this variable is visible for other threats

        fun getInstance() = instance
            ?: synchronized(this) { //if intance not null return instance else create instance
                instance ?: FakeDatabase().also {
                    instance = it
                }   //check again, if instance not null return instance else create object and initialize instance by new object
            }

    }

}