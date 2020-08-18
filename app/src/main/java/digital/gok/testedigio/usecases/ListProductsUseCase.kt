package digital.gok.testedigio.usecases

import digital.gok.testedigio.data.ProductsRepository
import digital.gok.testedigio.model.products.ProductsList
import io.reactivex.rxjava3.core.Single

class ListProductsUseCase(private val repository: ProductsRepository) {
    fun execute(): Single<ProductsList> {
        return repository.listProducts()
    }
}