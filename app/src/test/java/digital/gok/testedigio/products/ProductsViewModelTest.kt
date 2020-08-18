package digital.gok.testedigio.products

import digital.gok.testedigio.usecases.IListProductsUseCase
import digital.gok.testedigio.usecases.ListProductsUseCase
import digital.gok.testedigio.utils.generateProductsList
import io.reactivex.rxjava3.core.Single
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*


internal class ProductsViewModelTest {

    private val useCase = mock(IListProductsUseCase::class.java)
    private val viewModel = ProductsViewModel(useCase)

    @Before
    fun setup() {
        `when`(useCase.execute()).thenReturn(Single.just(generateProductsList()))
    }

    @Test
    fun `View model must call use Case`() {
        viewModel.listProducts().test()
        verify(useCase, times(1)).execute()
    }
}