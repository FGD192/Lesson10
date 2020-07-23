package es.fgd192.lesson10

import android.graphics.ColorSpace
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PhoneAdaper(private val array: ArrayList<String>) : RecyclerView.Adapter<PhoneViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.butterflies, parent, false)
        var holder = PhoneViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        var item = array[position]
        holder.bind(item)
    }
}




class PhoneAdaper2(private val array: ArrayList<String>) :
    RecyclerView.Adapter<PhoneViewHolder2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder2 {
        var view2 = LayoutInflater.from(parent.context).inflate(R.layout.butterfly2, parent, false)
        var holder2 = PhoneViewHolder2(view2)
        return holder2
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: PhoneViewHolder2, position: Int) {
        var item = array[position]
        holder.bind(item)
    }
}