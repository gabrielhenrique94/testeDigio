package digital.gok.testedigio.api

import digital.gok.testedigio.model.api.ProductListReponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface DigioApi {
    @GET("products")
    fun getProducts(): Single<ProductListReponse>
}