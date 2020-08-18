package digital.gok.testedigio.products.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import digital.gok.testedigio.R

class ProductsAdapter : RecyclerView.Adapter<ProductViewHolder>() {

    private val list: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.product_icon_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun add(items: List<String>) {
        list.addAll(items)
        notifyItemRangeInserted(list.lastIndex - list.size, list.size)
    }
}