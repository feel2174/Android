package com.example.navitest

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.view.View
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener  {

    private var isNavigationOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setToolbar()

        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun setToolbar(){
        setSupportActionBar(toolbar)

        // 툴바 왼쪽 버튼 설정
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)  // 왼쪽 버튼 사용 여부 true
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp)  // 왼쪽 버튼 이미지 설정
        supportActionBar!!.setDisplayShowTitleEnabled(false)    // 타이틀 안보이게 하기
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // 클릭된 메뉴 아이템의 아이디 마다 when 구절로 클릭시 동작을 설정한다.
       when(item!!.itemId){
          android.R.id.home->{ // 메뉴 버튼
           drawerLayout.openDrawer(GravityCompat.START)    // 네비게이션 드로어 열기
                }
            R.id.star-> Snackbar.make(toolbar,"Star menu pressed",Snackbar.LENGTH_SHORT).show()
             R.id.account-> Snackbar.make(toolbar,"Account menu pressed",Snackbar.LENGTH_SHORT).show()
             R.id.logout-> Snackbar.make(toolbar,"Logout menu pressed",Snackbar.LENGTH_SHORT).show()
            }
            return super.onOptionsItemSelected(item)


    }
}