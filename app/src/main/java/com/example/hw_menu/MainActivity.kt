package com.example.hw_menu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_menu.R.string.*
import com.example.hw_menu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var isLogin = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

                val binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        Toast.makeText(applicationContext, "called onCreateOptionsMenu", Toast.LENGTH_SHORT).show()
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_layout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(applicationContext, "called onOptionsItemSelected", Toast.LENGTH_SHORT).show()
        if (item.itemId == R.id.contactmenu){
            val intent = Intent(this, contactus::class.java)
            this.startActivity(intent)
            return true
        }else if (item.itemId == R.id.settingmenu){
            val intent = Intent(this, setting::class.java)
            this.startActivity(intent)
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
        }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        var menuItem: MenuItem = menu!!.findItem(R.id.loginmenu)
        var menuItem2: MenuItem = menu!!.findItem(R.id.logoutmenu)

        if(isLogin){
            menuItem.setVisible(false)
            isLogin = false
            menuItem.setVisible(false)
            menuItem2.setVisible(true)
           //menuItem.isVisible = getString(R.string.logout)
        }else{
            isLogin = true
            menuItem2.setVisible(false)
            menuItem.setVisible(true)
        }
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d("MainActivity", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart called")
    }


    }
