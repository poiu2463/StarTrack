package com.example.startrack.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.startrack.Model.CargoRun
import com.example.startrack.R

class CargoListRecyclerAdapter(private val dataset: List<CargoRun>, private val onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<CargoListRecyclerAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    inner class ViewHolder(private val listViewItem: View, private val onItemClickListener: OnItemClickListener): RecyclerView.ViewHolder(listViewItem) {
        /*
        val taskNameView: TextView = listViewItem.findViewById(R.id.taskNameTextView)
        val priorityItemTextView: TextView = listViewItem.findViewById(R.id.priorityItemTextView)
        val descriptionTextView: TextView = listViewItem.findViewById(R.id.descriptionTextView)
        val dateTextView: TextView = listViewItem.findViewById(R.id.dateTextView)
        val openCloseImageView: ImageView = listViewItem.findViewById(R.id.openCloseImageView)
        val emojiTextView: TextView = listViewItem.findViewById(R.id.emojiTextView)

         */

        init{
            listViewItem.setOnClickListener(){
                onItemClickListener.onItemClick(adapterPosition)
            }
        }
    } // end inner class

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CargoListRecyclerAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.cargo_run_item, parent, false)
        return ViewHolder(itemView, onItemClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        /*
        holder.taskNameView.text = dataset[position].title
        holder.priorityItemTextView.text = dataset[position].priority.toString()
        if(dataset[position].priority == Priority.HIGH) holder.priorityItemTextView.setTextColor(Color.parseColor("#FF0000")) //Change color to red
        if(dataset[position].priority == Priority.MEDIUM) holder.priorityItemTextView.setTextColor(Color.parseColor("#FFA500")) // Change color to orange
        if(dataset[position].priority == Priority.LOW) holder.priorityItemTextView.setTextColor(Color.parseColor("#008000")) // change color to green
        holder.descriptionTextView.text = dataset[position].description
        holder.dateTextView.text = dataset[position].dueDate
        holder.openCloseImageView.setImageResource(dataset[position].getStatusImage())
        holder.emojiTextView.text = dataset[position].emoji

         */
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

} // end class