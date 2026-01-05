package com.example.histoiredunigeriv;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HistoirePagerAdapter extends FragmentStateAdapter {

    public HistoirePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public HistoirePagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Retourne un fragment différent pour chaque période
        switch (position) {
            case 0: return new PeriodePrehistoireFragment();
            case 1: return new PeriodeEmpiresFragment();
            case 2: return new PeriodeColonialeFragment();
            case 3: return new PeriodeIndependanceFragment();
            case 4: return new PeriodeModerneFragment();
            case 5: return new ParenteFragment();
            default: return new PeriodePrehistoireFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 6; // 5 périodes
    }
}

