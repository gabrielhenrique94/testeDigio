package digital.gok.testedigio.usecases

import digital.gok.testedigio.data.IProductsRepository
import digital.gok.testedigio.data.ProductsRepository
import digital.gok.testedigio.utils.generateProductsList
import io.reactivex.rxjava3.core.Single
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import kotlin.concurrent.timer


internal class ListProductsUseCaseTest {

    val repository: IProductsRepository = mock(IProductsRepository::class.java)
    val useCase = ListProductsUseCase(repository)

    @Before
    fun setup() {
        `when`(repository.listProducts()).thenReturn(Single.just(generateProductsList()))
    }

    @Test
    fun `use case must call repository`() {
        useCase.execute().test()
        verify(repository, times(1)).listProducts()
    }
}