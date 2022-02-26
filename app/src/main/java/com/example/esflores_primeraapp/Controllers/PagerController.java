package com.example.esflores_primeraapp.Controllers;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
int tabsNum;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.tabsNum = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new AcercaDe();

            case 1:
                return new Usis();

            case 2:
                return new Colores();

                default:
                return null;
        }
    }

    @Override
    public int getCount() {
    return tabsNum;
    }
}
