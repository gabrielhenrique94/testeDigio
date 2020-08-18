package digital.gok.testedigio.products.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.spotlight_item.view.*

class SpotlightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(imgUrl: String) {
        itemView.apply {
            Picasso.get()
                .load(imgUrl)
                .fit()
                .into(image)
        }
    }
}