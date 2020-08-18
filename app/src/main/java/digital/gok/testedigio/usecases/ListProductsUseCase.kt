package digital.gok.testedigio.usecases

import digital.gok.testedigio.data.IProductsRepository
import digital.gok.testedigio.data.ProductsRepository
import digital.gok.testedigio.model.products.ProductsList
import io.reactivex.rxjava3.core.Single

class ListProductsUseCase(private val repository: IProductsRepository) : IListProductsUseCase {
    override fun execute(): Single<ProductsList> {
        return repository.listProducts()
    }
}