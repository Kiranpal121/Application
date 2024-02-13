package com.example.myapplication


import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            findViewById(R.id.toolbar),
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    Toast.makeText(applicationContext, "Home clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_settings -> {
                    Toast.makeText(applicationContext, "Settings clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    drawerLayout.closeDrawers()
                    true
                }
                R.id.nav_help -> {
                    Toast.makeText(applicationContext, "Help clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_logout -> {
                    Toast.makeText(applicationContext, "Logout clicked", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }
                else -> false
            }
        }

        // Find the Compostify button
        val compostifyButton = findViewById<Button>(R.id.compostify)
        compostifyButton.setOnClickListener {
            // Start the CompostActivity
            val intent = Intent(this, Compost::class.java)
            startActivity(intent)
        }

        // Find the Bin Status button
        val binStatusButton = findViewById<Button>(R.id.binstatus)
        binStatusButton.setOnClickListener {
            // Start the BinStatusActivity
            val intent = Intent(this, BinSatus::class.java)
            startActivity(intent)
        }

        // Find the Report button
        val reportButton = findViewById<Button>(R.id.reportv)
        reportButton.setOnClickListener {
            // Start the ReportActivity
            val intent = Intent(this, Report::class.java)
            startActivity(intent)
        }

        // Find the Sprinkle button
        val sprinkleButton = findViewById<Button>(R.id.sprik)
        sprinkleButton.setOnClickListener {
            // Start the SprinkleActivity
            val intent = Intent(this, Sprinkle::class.java)
            startActivity(intent)
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
