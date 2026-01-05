package com.example.histoiredunigeriv;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MainPagerAdapter extends FragmentStateAdapter {

    public MainPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentHistoire(); // Votre fragment avec onglets
            case 1:
                return new FragmentRegions(); // À créer
            case 2:
                return new FragmentCulture(); // À créer

            default:
                return new FragmentHistoire();
        }
    }

    @Override
    public int getItemCount() {
        return 3; // 3 onglets principaux
    }
}
