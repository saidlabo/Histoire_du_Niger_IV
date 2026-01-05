package com.example.histoiredunigeriv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class PeriodeColonialeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_periode_simple, container, false);

        TextView textView = view.findViewById(R.id.textViewContent);
        textView.setText("Les periodes coloniales"+"\n"
                +"Les premiers Européens à entrer dans cette région sont les explorateurs britanniques Mungo Park (sur le fleuve Niger, 1806), Hugh Clapperton et Dixon Denham (traversée du Sahara de Tripoli à la vile de Koukaoua, capitale du royaume du Bornou, à l'ouest du lac Tchad, par le Kaouar, 1824) et l'explorateur allemand Heinrich Barth (qui traverse les régions de l'actuel Niger pour se rendre à Kano et Tombouctou, de 1850 à 1854). Ces expéditions, toutes organisées et financées par la Grande-Bretagne, visent, tout au moins officiellement, à combattre la traite négrière, et à ouvrir ces régions au commerce européen, sans objectif immédiat de conquête.\n" +
                "\n" +
                "Vers 1890, les Français entrent dans la région, atteignent le lac Tchad et luttent contre le sultan Rabah dont l'influence s'étend sur le Bornou. Ils mettent longtemps à réduire la résistance des Touaregs de l'Aïr. En 1900, les Français font du Niger un territoire militaire administré à partir de l'ancien sultanat de Zinder. En 1901, Niamey reçoit le convoi d'Eugène Lenfant. Le Niger devient une colonie française en 1922, la colonie autonome du Niger. Jules Brévié en est le premier gouverneur[3].\n" +
                "\n" +
                "En 1927, le Niger devient une colonie administrée à partir de Niamey pour rééquilibrer les pouvoirs économiques et politiques locaux, diminuer le poids de la communauté haoussa de Zinder ainsi que l'influence du nord du Nigeria, une région riche et peuplée. En 1946, il devient territoire d'outre-mer, avec un élu le représentant au sein de l'Assemblée nationale française. Le Parti progressiste nigérien (PPN), créé en mai 1946 et affilié au Rassemblement démocratique africain, est la première formation politique officialisée sur ce territoire. D'autres formations apparaissent dans la foulée, dont l'Union démocratique nigérienne (UDN) en 1954 et du Bloc nigérien d'action (BNA) en 1955. Puis ce territoire est doté d'un exécutif local, un conseil de gouvernement élu en 1956, conséquence de la loi-cadre Defferre. Les élections du 31 mars 1957 sont remportées par le Sawaba (fusion de l'UDN. et du BNA) avec comme chef de file, Djibo Bakary, favorable à l'indépendance[3].\n" +
                "\n" +
                "La région est frappée par la famine en 1931, provoquant la mort de 20 % à 25 % de la population[4].\n" +
                "\n" +
                "Le 18 décembre 1958, le Niger devient une république autonome au sein de la Communauté " +
                "française, malgré une campagne pour le « non » au référendum menée par le leadeur " +
                "du Sawaba Djibo Bakary[5], opposé au chef du gouvernement Hamani Diori, le « oui » l'emporte à l’issue d'un scrutin truqué[6]..");

        return view;
    }
}

