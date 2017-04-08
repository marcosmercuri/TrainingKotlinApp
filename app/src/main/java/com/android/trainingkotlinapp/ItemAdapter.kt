package com.android.trainingkotlinapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*


class ItemAdapter(val items:List<Item>, val listener: (Item) -> Unit) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(view:View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(parent.inflate(R.layout.view_item))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        with(holder.itemView) {
            item_title.text = item.title
            item_image.loadUrl(item.url)
            setOnClickListener { listener(item) }
        }
    }

    override fun getItemCount(): Int = items.size
}

