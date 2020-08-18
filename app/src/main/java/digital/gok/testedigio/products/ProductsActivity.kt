package digital.gok.testedigio.products

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import com.squareup.picasso.Picasso
import digital.gok.testedigio.R
import digital.gok.testedigio.extensions.paintFirstWord
import digital.gok.testedigio.model.products.ProductsList
import digital.gok.testedigio.products.adapters.ProductsAdapter
import digital.gok.testedigio.products.adapters.SpotlightAdapter
import kotlinx.android.synthetic.main.item_cash.*
import kotlinx.android.synthetic.main.products_activity.*
import org.koin.android.ext.android.inject

class ProductsActivity : AppCompatActivity() {
    private lateinit var spotilghtAdapter: SpotlightAdapter
    private lateinit var productsAdapter: ProductsAdapter
    val viewModel by inject<ProductsViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.products_activity)
        initAdapters()
        viewModel.listProducts().subscribe(::onLoadingProducts, this::onError)

    }

    private fun initAdapters() {
        productsAdapter = ProductsAdapter()
        productsRecyclerView.adapter = productsAdapter
        spotilghtAdapter = SpotlightAdapter()
        spotlightRecyclerView.adapter = spotilghtAdapter
    }

    fun onLoadingProducts(productsList: ProductsList) {
        productsAdapter.add(productsList.products)
        spotilghtAdapter.add(productsList.spotlight)
        Picasso.get().load(productsList.cash.bannerURL).into(cash_image)
        cash_title.text = productsList.cash.title.paintFirstWord(this)
    }

    fun onError(throwable: Throwable) {
        throwable.printStackTrace()
        Toast.makeText(this, R.string.error, LENGTH_LONG).show()
    }
}