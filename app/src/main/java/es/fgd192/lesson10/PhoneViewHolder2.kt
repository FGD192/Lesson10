package es.fgd192.lesson10

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.butterflies.view.*
import kotlinx.android.synthetic.main.butterflies.view.TeVi
import kotlinx.android.synthetic.main.butterfly2.view.*

class PhoneViewHolder2(view2: View) : RecyclerView.ViewHolder(view2) {
    fun bind(item: String){
        itemView.TeVi.text = item
    }
}