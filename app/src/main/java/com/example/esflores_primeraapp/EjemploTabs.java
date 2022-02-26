package com.example.esflores_primeraapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.esflores_primeraapp.Controllers.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class EjemploTabs extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem acercaDeTab, usisTab, codeTab;
    PagerController pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_tabs);
        linking();

        pagerAdapter = new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());
        
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0 ){
                    pagerAdapter.notifyDataSetChanged();
                }

                if(tab.getPosition() == 1){
                    pagerAdapter.notifyDataSetChanged();
                }

                if(tab.getPosition() == 2){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }



    private void linking (){
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.pageView);

    }
}