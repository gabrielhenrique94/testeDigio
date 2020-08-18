package digital.gok.testedigio.model.products

import digital.gok.testedigio.model.api.ProductListReponse

data class ProductsList(
    val spotlight: List<String>,
    val products: List<String>,
    val cash: Cash
) {
    companion object {
        fun fromProductListResponse(productListReponse: ProductListReponse): ProductsList {
            return ProductsList(
                productListReponse.spotlight.map { it.bannerURL },
                productListReponse.products.map { it.imageURL },
                Cash.fromDto(productListReponse.cash)
            )
        }
    }
}