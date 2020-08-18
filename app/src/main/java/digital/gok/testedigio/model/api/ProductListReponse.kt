package digital.gok.testedigio.model.api

import com.google.gson.annotations.SerializedName

data class ProductListReponse (
	@SerializedName("spotlight") val spotlight : List<SpotlightDTO>,
	@SerializedName("products") val products : List<ProductDTO>,
	@SerializedName("cash") val cash : CashDTO
)