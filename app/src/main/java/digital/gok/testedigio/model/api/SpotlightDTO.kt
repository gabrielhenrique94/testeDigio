package digital.gok.testedigio.model.api

import com.google.gson.annotations.SerializedName

data class SpotlightDTO(
    @SerializedName("name") val name: String,
    @SerializedName("bannerURL") val bannerURL: String,
    @SerializedName("description") val description: String
)