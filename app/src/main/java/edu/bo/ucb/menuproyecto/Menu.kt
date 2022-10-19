package edu.bo.ucb.menuproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatDrawableManager.get
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Menu : AppCompatActivity() {
    lateinit var rvButtons : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        rvButtons = findViewById(R.id.rv_buttons)
        val list = arrayListOf<Int>(
            R.drawable.configuraciones,
            R.drawable.alarmas,
            R.drawable.camara,
            R.drawable.contactos,
            R.drawable.galeria,
            R.drawable.horario,
        )
        val gridLayout = GridLayoutManager(this,2)
        gridLayout.orientation = GridLayoutManager.VERTICAL
        rvButtons.layoutManager = gridLayout
        rvButtons.adapter = MenuAdapter(list, applicationContext)

    }
}