package com.example.histoiredunigeriv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class PeriodePrehistoireFragment extends Fragment {

    private TextView textViewContent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_periode_simple, container, false);

        textViewContent = view.findViewById(R.id.textViewContent);
        textViewContent.setText("De nombreux fossiles de dinosaures (iguanodons) du Crétacé inférieur ont été trouvés à Tazolé, au Sud-Est de l'Aïr.\n" +
                "\n" +
                "En paléoanthropologie, dans la région, les découvertes récentes de restes de deux hominidé, Abel (1995, vieux de 3 millions d'années environ) et Toumaï (2001, daté d'environ sept millions d'années), dans le désert du Djourab (Tchad). L'établissement d'espèces éteintes (Sahelanthropus tchadensis, Australopithecus bahrelghazali) a imposé des révisions de l'histoire évolutive de la lignée humaine." +
                "On a mis au jour dans le massif de l'Aïr des vestiges de céramiques du VIIIe millénaire av. J.-C. avant notre ère, contemporains de l'invention de la poterie dans d'autres régions du monde. Entre 4000 et 3000 av. J.-C., lors de la dernière période pluviale du Sahara, se situe un hypothétique âge du bétail (de) ou culture ténéréenne, dont témoignent les peintures et gravures rupestres du Ténéré : site archéologique de l'Adrar Bous et de Gobero, Kiffiens, gravures rupestres du Tassili. L'Arbre du Ténéré, acacia solitaire, renversé en 1973, a longtemps été le dernier vestige de la flore de cette époque.\n" +
                "\n" +
                "Entre 3000 et 2000 av. J.-C., la désertification du Sahara, commencée à cette époque, repousse ensuite vers le sud les populations d'agriculteurs et les céramistes, laissant la place à des communautés d'éleveurs de bovins qui gravent sur les rochers de nombreuses représentations de leurs troupeaux. Des gravures de cette époque témoignent également de la présence à cette latitude d'éléphants, d'hippopotames et d'une faune de savane abondante et variée.\n" +
                "\n" +
                "Le désert du Ténéré est riche en témoignages de la présence humaine au Néolithique par un abondant matériel de pierre (pointes de flèches, meules, etc.), jusqu'à la désertification de la région au Ier siècle avant notre ère.\n" +
                "\n" +
                "Métallurgie du fer en Afrique (en)");

        return view;
    }
}
