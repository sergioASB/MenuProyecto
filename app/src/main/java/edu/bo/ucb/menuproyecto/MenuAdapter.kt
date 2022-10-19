package edu.bo.ucb.menuproyecto

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(val list: ArrayList<Int>, applicationContext: Context?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_row, parent, false)
        return UserListViewHolder(view)

    }

    class UserListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list.get(position)
        val list2= arrayListOf<String>(
            "Configuraciones",
            "Alarmas",
            "Cámara",
            "Contactos",
            "Galería",
            "Horarios"

        )
        val item2= list2.get(position)
        holder.itemView.findViewById<ImageView>(R.id.rv_option1).setImageResource(item)
        holder.itemView.findViewById<TextView>(R.id.textView1).text= item2
        //val imagen= holder.itemView.findViewById<ImageView>(R.id.rv_option1)
        //imagen.setImageResource(item)
        //imagen.setOnClickListener()
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
