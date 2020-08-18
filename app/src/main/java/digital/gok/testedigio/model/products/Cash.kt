package digital.gok.testedigio.model.products

import com.google.gson.annotations.SerializedName
import digital.gok.testedigio.model.api.CashDTO

data class Cash(
    val title: String,
    val bannerURL: String
) {
    companion object {
        fun fromDto(dto: CashDTO): Cash {
            return Cash(dto.title, dto.bannerURL)
        }
    }
}