package com.example.sismocontrol.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sismocontrol.databinding.SismoItemBinding
import com.example.sismocontrol.entities.Sismo

class SismoAdapter: RecyclerView.Adapter<SismoAdapter.SismoViewHolder>(){
    //atributo de la clase
    var sismos = mutableListOf<Sismo>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field=value
            this.notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SismoAdapter.SismoViewHolder {
        val bindingItem= SismoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SismoViewHolder(bindingItem)
    }

    override fun onBindViewHolder(holder: SismoAdapter.SismoViewHolder, position: Int) {
        val sismo:Sismo = sismos[position]
        holder.bind(sismo)
    }

    override fun getItemCount(): Int {
        return sismos.size
    }

    inner class SismoViewHolder(private var bindingItem: SismoItemBinding)
        : RecyclerView.ViewHolder(bindingItem.root){
            fun bind(sismo: Sismo)
            {
                with(sismo){
                    bindingItem.magnitudtxt.text = sismo.magnitud.toString()
                    bindingItem.locationtxt.text = sismo.lugar
                }

            }

    }

}