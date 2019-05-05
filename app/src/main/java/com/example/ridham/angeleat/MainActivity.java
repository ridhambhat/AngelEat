package com.example.ridham.angeleat;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 public static FragmentManager fragmentManager;
    BottomNavigationView bottomNavigationView;
    LinearLayout l1;
    //RelativeLayout cut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=getSupportFragmentManager();
        home fragment = new home();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contentFragment, fragment);
        transaction.commit();


        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_navigation);
       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
              int id=menuItem.getItemId();
            //   Toast.makeText(MainActivity.this, ""+id, Toast.LENGTH_SHORT).show();
               if(id==R.id.nav_home)
                 { MainActivity.fragmentManager.beginTransaction().replace(R.id.contentFragment,new home(),null).commit();
                 }
               else if(id==R.id.nav_kitchen)
                 { MainActivity.fragmentManager.beginTransaction().replace(R.id.contentFragment,new MyFragment(),null).commit();
                      }
               else if(id==R.id.nav_chat)
                 { MainActivity.fragmentManager.beginTransaction().replace(R.id.contentFragment,new ChatFragment(),null).commit();
                 }

               return true;
           }
       });




    }



}

