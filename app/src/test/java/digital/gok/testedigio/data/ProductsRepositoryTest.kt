package digital.gok.testedigio.data

import digital.gok.testedigio.api.DigioApi
import digital.gok.testedigio.utils.generateProductsResponse
import io.reactivex.rxjava3.core.Single
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*


internal class ProductsRepositoryTest {
    private val api = mock(DigioApi::class.java)
    private val repository = ProductsRepository(api);

    @Before
    fun setup() {
        `when`(api.getProducts()).thenReturn(Single.just(generateProductsResponse()))
    }

    @Test
    fun `repository must call api`() {
        repository
            .listProducts()
            .test()
        verify(api, times(1)).getProducts()
    }
}