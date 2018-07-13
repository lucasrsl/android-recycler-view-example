package br.unifor.recyclerviewexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class NomesAdapter : RecyclerView.Adapter<NomeViewHolder>() {

    val listaNomes: List<String> = listOf("Ney", "Breno", "Ricardo")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomeViewHolder {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.viewholder_nome, parent, false)

        return NomeViewHolder(view)

    }

    override fun getItemCount(): Int = listaNomes.size

    override fun onBindViewHolder(holder: NomeViewHolder, position: Int) {
        holder.bind(listaNomes[position])
    }

}