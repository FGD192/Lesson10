package es.fgd192.lesson10

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.butterflies.view.*

class PhoneViewHolder(view: View) : RecyclerView.ViewHolder(view){
    fun bind(item: String){
        itemView.TeVi.text = item
    }
}