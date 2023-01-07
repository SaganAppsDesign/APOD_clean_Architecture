package com.example.apod.ui.view
import android.content.ClipDescription
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apod.R

class APODAdapter(private val context: Context,
                  private val images: MutableList<String?>,
                  private val titles: MutableList<String?>,
                  private val description: MutableList<String?>)
    : RecyclerView.Adapter<APODViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): APODViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return APODViewHolder(layoutInflater.inflate(R.layout.item_apod, parent, false))
    }

    override fun onBindViewHolder(holder: APODViewHolder, position: Int) {
        val image = images[position]
        val title = titles[position]
        val description = description[position]
        holder.bind(image, title, description, context)
    }

    override fun getItemCount(): Int = images.size

}