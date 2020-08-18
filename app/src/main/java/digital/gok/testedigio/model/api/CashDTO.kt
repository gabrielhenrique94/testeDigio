package digital.gok.testedigio.model.api

import com.google.gson.annotations.SerializedName

data class CashDTO(
    @SerializedName("title") val title: String,
    @SerializedName("bannerURL") val bannerURL: String,
    @SerializedName("description") val description: String
)