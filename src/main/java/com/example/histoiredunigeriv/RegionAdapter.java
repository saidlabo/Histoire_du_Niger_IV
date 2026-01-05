package com.example.histoiredunigeriv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RegionAdapter extends RecyclerView.Adapter<RegionAdapter.RegionViewHolder> {

    private List<Region> regions;
    private OnRegionClickListener listener;

    public interface OnRegionClickListener {
        void onRegionClick(Region region);
    }

    public RegionAdapter(List<Region> regions, OnRegionClickListener listener) {
        this.regions = regions;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RegionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_region, parent, false);
        return new RegionViewHolder(view);
    } // CORRECTION : Fermeture correcte de la méthode

    @Override
    public void onBindViewHolder(@NonNull RegionViewHolder holder, int position) {
        Region region = regions.get(position);

        // Remplir les données
        holder.imageRegion.setImageResource(region.getImageResource());
        holder.textNom.setText(region.getNom());
        holder.textCapitale.setText("Capitale : " + region.getCapitale());
        holder.textDescription.setText(region.getDescription());
        holder.textSuperficie.setText(region.getSuperficieFormatted());
        holder.textPopulation.setText(region.getPopulationFormatted());
        holder.textDepartements.setText(region.getDepartementsFormatted());

        // Gestion du clic
        holder.cardRegion.setOnClickListener(v -> {
            if (listener != null) {
                listener.onRegionClick(region);
            }
        });

        // Animation 1 : Animation de fondu et translation
        holder.itemView.setAlpha(0f);
        holder.itemView.setTranslationY(50);
        holder.itemView.animate()
                .alpha(1f)
                .translationY(0)
                .setDuration(300)
                .setStartDelay(position * 100)
                .start();

        // Animation 2 : Animation XML (optionnel, une seule suffit)
        //Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.item_animation);
       // holder.itemView.startAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return regions.size();
    }

    static class RegionViewHolder extends RecyclerView.ViewHolder {
        CardView cardRegion;
        ImageView imageRegion;
        TextView textNom, textCapitale, textDescription;
        TextView textSuperficie, textPopulation, textDepartements;

        RegionViewHolder(@NonNull View itemView) {
            super(itemView);
            cardRegion = itemView.findViewById(R.id.cardRegion);
            imageRegion = itemView.findViewById(R.id.imageRegion);
            textNom = itemView.findViewById(R.id.textNom);
            textCapitale = itemView.findViewById(R.id.textCapitale);
            textDescription = itemView.findViewById(R.id.textDescription);
            textSuperficie = itemView.findViewById(R.id.textSuperficie);
            textPopulation = itemView.findViewById(R.id.textPopulation);
            textDepartements = itemView.findViewById(R.id.textDepartements);
        }
    }

}