package br.unifor.recyclerviewexample

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.viewholder_nome.view.*

class NomeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(nomeValor: String){

        with(view){
            nome.text = nomeValor
        }

    }

}