package digital.gok.testedigio.data

import digital.gok.testedigio.api.DigioApi
import digital.gok.testedigio.model.products.ProductsList
import io.reactivex.rxjava3.core.Single

class ProductsRepository(private val api: DigioApi) : IProductsRepository {
    override fun listProducts(): Single<ProductsList> {
        return api.getProducts().map {
            ProductsList.fromProductListResponse(it)
        }
    }
}
