package digital.gok.testedigio.model.api

import com.google.gson.annotations.SerializedName


data class ProductDTO (
	@SerializedName("name") val name : String,
	@SerializedName("imageURL") val imageURL : String,
	@SerializedName("description") val description : String
)