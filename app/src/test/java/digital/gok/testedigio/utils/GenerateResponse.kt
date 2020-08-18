package digital.gok.testedigio.utils

import digital.gok.testedigio.model.api.CashDTO
import digital.gok.testedigio.model.api.ProductDTO
import digital.gok.testedigio.model.api.ProductListReponse
import digital.gok.testedigio.model.api.SpotlightDTO
import digital.gok.testedigio.model.products.Cash
import digital.gok.testedigio.model.products.ProductsList

fun generateProductsResponse(): ProductListReponse {
    return ProductListReponse(
        listOf(
            SpotlightDTO(
                "Recarga",
                "https://s3-sa-east-1.amazonaws.com/digio-exame/recharge_banner.png",
                "description"
            ),
            SpotlightDTO(
                "Recarga",
                "https://s3-sa-east-1.amazonaws.com/digio-exame/recharge_banner.png",
                "description"
            ),
            SpotlightDTO(
                "Recarga",
                "https://s3-sa-east-1.amazonaws.com/digio-exame/recharge_banner.png",
                "description"
            )
        ),
        listOf(
            ProductDTO(
                "XBOX",
                "https://s3-sa-east-1.amazonaws.com/digio-exame/xbox_icon.png",
                "description"
            ),
            ProductDTO(
                "XBOX",
                "https://s3-sa-east-1.amazonaws.com/digio-exame/xbox_icon.png",
                "description"
            ),
            ProductDTO(
                "XBOX",
                "https://s3-sa-east-1.amazonaws.com/digio-exame/xbox_icon.png",
                "description"
            )
        ),
        CashDTO(
            "digio Cash",
            "https://s3-sa-east-1.amazonaws.com/digio-exame/cash_banner.png",
            "description"
        )
    )
}

fun generateProductsList(): ProductsList {
    return ProductsList(
        listOf(
            "https://s3-sa-east-1.amazonaws.com/digio-exame/recharge_banner.png",
            "https://s3-sa-east-1.amazonaws.com/digio-exame/recharge_banner.png",
            "https://s3-sa-east-1.amazonaws.com/digio-exame/recharge_banner.png"
        ),
        listOf(
            "https://s3-sa-east-1.amazonaws.com/digio-exame/xbox_icon.png",
            "https://s3-sa-east-1.amazonaws.com/digio-exame/xbox_icon.png",
            "https://s3-sa-east-1.amazonaws.com/digio-exame/xbox_icon.png",
            "https://s3-sa-east-1.amazonaws.com/digio-exame/xbox_icon.png"
        ),
        Cash(
            "digio Cash",
            "https://s3-sa-east-1.amazonaws.com/digio-exame/cash_banner.png"
        )
    )
}