package com.example.histoiredunigeriv;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FragmentRegions extends Fragment implements RegionAdapter.OnRegionClickListener {

    private RecyclerView recyclerView;
    private LinearLayout emptyView; // CHANGÉ : Maintenant c'est un LinearLayout
    private RegionAdapter adapter;
    private List<Region> regions;
    private SearchView searchView;
    private List<Region> allRegions;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_regions, container, false);

        // Initialiser les vues
        recyclerView = view.findViewById(R.id.recyclerViewRegions);
        emptyView = view.findViewById(R.id.emptyView); // C'est le LinearLayout
        searchView = view.findViewById(R.id.searchView);

        // Configurer le RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        // Charger les données
        loadRegions();

        // Sauvegarder la liste complète
        allRegions = new ArrayList<>(regions);

        // Configurer l'adapter
        adapter = new RegionAdapter(regions, this);
        recyclerView.setAdapter(adapter);

        // Configurer la recherche
        if (searchView != null) {
            setupSearchView();
        }

        // Vérifier si la liste est vide
        updateEmptyView();

        return view;
    }

    private void setupSearchView() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterRegions(newText);
                return true;
            }
        });
    }

    private void filterRegions(String query) {
        List<Region> filteredList = new ArrayList<>();

        if (query.isEmpty()) {
            filteredList.addAll(allRegions);
        } else {
            for (Region region : allRegions) {
                if (region.getNom().toLowerCase().contains(query.toLowerCase()) ||
                        region.getCapitale().toLowerCase().contains(query.toLowerCase())) {
                    filteredList.add(region);
                }
            }
        }

        regions.clear();
        regions.addAll(filteredList);
        adapter.notifyDataSetChanged();
        updateEmptyView();
    }

    private void updateEmptyView() {
        if (regions == null || regions.isEmpty()) {
            // Afficher la vue vide
            if (emptyView != null) {
                emptyView.setVisibility(View.VISIBLE);
            }
            if (recyclerView != null) {
                recyclerView.setVisibility(View.GONE);
            }
        } else {
            // Afficher la liste
            if (emptyView != null) {
                emptyView.setVisibility(View.GONE);
            }
            if (recyclerView != null) {
                recyclerView.setVisibility(View.VISIBLE);
            }
        }
    }

    private void loadRegions() {
        regions = new ArrayList<>();

        // Utilisez un drawable par défaut
        int defaultDrawable = android.R.drawable.ic_dialog_map;

        // 1. AGADEZ
        regions.add(new Region(
                1,
                "Agadez",
                "Agadez",
                defaultDrawable,
                "La région d'Agadez est la plus grande du Niger.",
                667799,
                500000,
                3
        ));

        // 2. DIFFA
        regions.add(new Region(
                2,
                "Diffa",
                "Diffa",
                defaultDrawable,
                "Région frontalière avec le Nigeria et le Tchad.",
                156906,
                600000,
                2
        ));

        // 3. DOSSO
        regions.add(new Region(
                3,
                "Dosso",
                "Dosso",
                defaultDrawable,
                "Région agricole par excellence, Dosso est le grenier du Niger.",
                31002,
                2500000,
                5
        ));

        // 4. MARADI
        regions.add(new Region(
                4,
                "Maradi",
                "Maradi",
                defaultDrawable,
                "Considérée comme la capitale économique du Niger.",
                38581,
                3800000,
                6
        ));

        // 5. NIAMEY
        regions.add(new Region(
                5,
                "Niamey",
                "Niamey",
                defaultDrawable,
                "Capitale du Niger et centre politique, administratif et culturel.",
                239,
                1500000,
                1
        ));

        // 6. TAHOUA
        regions.add(new Region(
                6,
                "Tahoua",
                "Tahoua",
                defaultDrawable,
                "Région carrefour entre le nord et le sud.",
                106677,
                3300000,
                8
        ));

        // 7. TILLABÉRI
        regions.add(new Region(
                7,
                "Tillabéri",
                "Tillabéri",
                defaultDrawable,
                "Région traversée par le fleuve Niger.",
                89623,
                3200000,
                6
        ));

        // 8. ZINDER
        regions.add(new Region(
                8,
                "Zinder",
                "Zinder",
                defaultDrawable,
                "Ancienne capitale du Niger, riche en histoire.",
                155778,
                4300000,
                5
        ));
    }

    @Override
    public void onRegionClick(Region region) {
        // Ouvrir l'activité de détail
        Intent intent = new Intent(getActivity(), RegionDetailActivity.class);
        intent.putExtra("REGION_ID", region.getId());
        startActivity(intent);
    }
}