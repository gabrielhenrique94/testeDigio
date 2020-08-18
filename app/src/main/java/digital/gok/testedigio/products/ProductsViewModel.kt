package digital.gok.testedigio.products

import digital.gok.testedigio.model.products.ProductsList
import digital.gok.testedigio.usecases.ListProductsUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import okhttp3.internal.userAgent

class ProductsViewModel(private val useCase: ListProductsUseCase) {

    fun listProducts(): Single<ProductsList> {
        return useCase.execute()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}