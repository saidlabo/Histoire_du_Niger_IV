package com.example.histoiredunigeriv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragmentHistoire extends Fragment {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private HistoirePagerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // CORRECTION : Utilisez le bon layout
        View view = inflater.inflate(R.layout.fragment_histoire_tabs, container, false);

        viewPager = view.findViewById(R.id.viewPagerHistoire);
        tabLayout = view.findViewById(R.id.tabLayoutHistoire);

        // Configurer l'adapter
        adapter = new HistoirePagerAdapter(this);
        viewPager.setAdapter(adapter);

        // Configurer les onglets
        String[] tabTitles = {"Préhistoire", "Empires", "Coloniale", "Indépendance", "Moderne","Parenté"};

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText(tabTitles[position])
        ).attach();

        return view;
    }
}
