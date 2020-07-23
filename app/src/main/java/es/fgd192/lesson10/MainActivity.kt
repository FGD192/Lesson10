package es.fgd192.lesson10

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var ReVi: RecyclerView? = null
    private var ReVi2: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter()
        initView()
        adapter2()
    }
    private fun initView(){
        ReVi = findViewById(R.id.ReVi)
        ReVi2 = findViewById(R.id.ReVi2)
    }
    private fun adapter(){
        var List = arrayListOf<String>()
        for (i in 1..10){
            List.add("item number $i")
        }
        var adapter = PhoneAdaper(List)
        ReVi?.adapter = adapter
    }
    private fun adapter2(){
        var List2 = arrayListOf<String>()
        for (i in 1..10){
            List2.add("item number $i")
        }
        var adapter2 = PhoneAdaper(List2)
        ReVi2?.adapter = adapter2
    }
}