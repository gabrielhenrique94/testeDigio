package digital.gok.testedigio.products

import digital.gok.testedigio.model.products.ProductsList
import io.reactivex.rxjava3.core.Single

interface IProductsViewModel {
    fun listProducts(): Single<ProductsList>
}