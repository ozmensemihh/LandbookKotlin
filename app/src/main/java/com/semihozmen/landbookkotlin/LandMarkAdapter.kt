package com.semihozmen.landbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semihozmen.landbookkotlin.databinding.RecRowBinding

class LandMarkAdapter (val landMarklist :ArrayList<LandMark>): RecyclerView.Adapter<LandMarkAdapter.LandMarHolder>() {

    class LandMarHolder (val binding: RecRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarHolder {
        val binding = RecRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarHolder, position: Int) {

        holder.binding.rvName.text = landMarklist.get(position).name

        holder.itemView.setOnClickListener{
            val intent  = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landMarklist.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }


    override fun getItemCount(): Int {
        return landMarklist.size
    }







}