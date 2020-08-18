package digital.gok.testedigio.products

import digital.gok.testedigio.model.products.ProductsList
import digital.gok.testedigio.usecases.IListProductsUseCase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class ProductsViewModel(private val useCase: IListProductsUseCase) : IProductsViewModel {

    override fun listProducts(): Single<ProductsList> {
        return useCase.execute()
            .subscribeOn(Schedulers.io())
    }
}