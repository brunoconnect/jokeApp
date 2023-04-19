package co.tiagoaguiar.tutorial.jokerappdev.data

import android.os.Handler
import android.os.Looper
import android.util.Log

class CategoryRemoteDataSource {

    fun findAllCategories(callback: ListCategoryCallback){
        Handler(Looper.getMainLooper()).postDelayed({
            val response = arrayListOf(
                "Categoria 1",
                "Categoria 2",
                "Categoria 3",
                "Categoria 4"
            )

            Log.i("testeinfo", response.toString())

            callback.onSucess(response)
//            onError("FALHA NA CONEXÃO. TENTE NOVAMENTE MAIS TARDE.")

            callback.onComplete()
        }, 2000)
    }
}