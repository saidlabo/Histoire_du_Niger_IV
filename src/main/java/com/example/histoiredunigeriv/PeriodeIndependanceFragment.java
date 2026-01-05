package com.example.histoiredunigeriv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class PeriodeIndependanceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_periode_simple, container, false);

        TextView textView = view.findViewById(R.id.textViewContent);
        textView.setText("Période des Independances au Niger..."+"\n"+
                "Le 3 août 1960, le Niger accède à l'indépendance et Hamani Diori (1916-1989) est élu président par l'Assemblée nationale. L'opposition avec Djibo Bakary devient de plus en plus forte. Ce dernier est contraint à l'exil à la veille de l'indépendance, bien que bénéficiant du soutien du camp progressiste ouest-africain (Kwame Nkrumah, Ahmed Sékou Touré)[5].\n" +
                "\n" +
                "Le président Hamani Diori est l'un des premiers dirigeants à lancer l'idée d'un sommet francophone ou d'une organisation internationale permanente des « parlant français ». Le premier pas vers une telle organisation est la création, à la conférence de Niamey, en 1970, de l'Agence de coopération culturelle et technique[7].\n" +
                "\n" +
                "En avril 1965, le président nigérien échappe à une tentative d'assassinat. Il est réélu la même année, soutenu par le Parti progressiste nigérien (PPN) qu'il a fondé à partir de la section nigérienne du Rassemblement démocratique africain (RDA).\n" +
                "\n" +
                "Le pays prend une importance nouvelle avec l'exploitation de ses ressources minières en uranium à partir de 1968. L'exportation vers la France de l'uranium nigérien s'inscrit depuis 1971, dans le cadre des «débouchés privilégiés» négociés entre les deux Etats, s'inscrivant dans l'accord de « coopération économique » signé en 1961, au moment de l'indépendance[8].");

        return view;
    }
}
