package com.example.kelompokpsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kelompokpsi.databinding.ActivityMainBinding
import com.example.kelompokpsi.databinding.ItemRowBinding

class RecycleAdapter(val items:MutableList<Biodata>) :
    RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    private lateinit var binding: ItemRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRowBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: ItemRowBinding) : RecyclerView.ViewHolder(itemView.root) {
        fun bind(item : Biodata) {
            binding.apply {
                tvNIM.text = item.nim.toString()
                tvNama.text = item.nama
            }
        }
    }
}