package digital.gok.testedigio.usecases

import digital.gok.testedigio.model.products.ProductsList
import io.reactivex.rxjava3.core.Single

interface IListProductsUseCase {
    fun execute(): Single<ProductsList>
}