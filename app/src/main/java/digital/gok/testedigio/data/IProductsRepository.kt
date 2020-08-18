package digital.gok.testedigio.data

import digital.gok.testedigio.model.products.ProductsList
import io.reactivex.rxjava3.core.Single

interface IProductsRepository {
    fun listProducts(): Single<ProductsList>
}