package com.anime.rezero.navigationbar;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khoitao();

    }

    void khoitao() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        actionBar = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBar);
        actionBar.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
    }


    //<Action bar>
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBar.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
//</Action bar>


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_trangchu) {
            Toast.makeText(this, "trang chủ", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.nav_laptop) {
            Toast.makeText(this, "laptop", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.nav_thongtin) {
            Toast.makeText(this, "thông tin", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.nav_tongdai) {
            Toast.makeText(this, "tổng đài", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.nav_timsieuthi) {
            Toast.makeText(this, "siêu thị", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
