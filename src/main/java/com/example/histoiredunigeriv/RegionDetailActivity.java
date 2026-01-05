package com.example.histoiredunigeriv;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.material.appbar.MaterialToolbar;

public class RegionDetailActivity extends AppCompatActivity {

    private ImageView imageRegion;
    private TextView textNom, textCapitale, textDescription;
    private TextView textSuperficie, textPopulation, textDepartements;
    private CardView cardInfo;
    private MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_detail);

        // Initialiser les vues
        initViews();

        // Récupérer l'ID de la région
        int regionId = getIntent().getIntExtra("REGION_ID", 1);

        // Charger les données de la région
        Region region = getRegionById(regionId);

        // Afficher les données
        displayRegionData(region);

        // Configurer la toolbar
        setupToolbar(region.getNom());
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        imageRegion = findViewById(R.id.imageRegionDetail);
        textNom = findViewById(R.id.textNomDetail);
        textCapitale = findViewById(R.id.textCapitaleDetail);
        textDescription = findViewById(R.id.textDescriptionDetail);
        textSuperficie = findViewById(R.id.textSuperficieDetail);
        textPopulation = findViewById(R.id.textPopulationDetail);
        textDepartements = findViewById(R.id.textDepartementsDetail);
        cardInfo = findViewById(R.id.cardInfo);
    }

    private Region getRegionById(int regionId) {
        // Méthode temporaire - plus tard vous pourrez utiliser une base de données
        switch (regionId) {
            case 1:
                return new Region(1, "Agadez", "Agadez",
                        R.drawable.ic_region_agadez,
                        "La région d'Agadez est la plus grande du Niger, célèbre pour son désert du Ténéré et la ville historique d'Agadez classée au patrimoine mondial de l'UNESCO. Elle abrite également le massif de l'Aïr et est un centre important de culture touarègue." +
                                "Sur les traces des savants d’Agadez au tournant du XXe siècle. Traduction d’un manuscrit de Bukhārī Tānūdé (écrit vers 1967-1969)\n" +
                                "In the footsteps of the scholars of Agadez at the turn of the 20th century. Translation of a manuscript of Bukhārī Tānūdé (written around 1967-1969)\n" +

                                "13 Il s’agit d’un personnage mythique qui est une figure fondatrice de l’islam savant dans la région. (...)\n" +
                                "14 Hārūn al-Rašīd Abū Ǧaʿfar, cinquième calife abbasside qui régna à Bagdad de 170/786 à 193/808.\n" +
                                "201 – Aḥmad al-Baġdādī13 : On m’a raconté qu’à l’époque abbasside, au temps de Hārūn al-Rašīd14 il y avait un gouverneur en Perse (fāris) avec qui al-Rašīd eut des démêlés. Ce dernier donna l’ordre de l’exécuter, ce qui fut fait.\n" +
                                "\n" +
                                "21Un certain Aḥmad avait été nommé à sa place comme gouverneur de la Perse. Le nouveau gouverneur épousa une persane qui lui donna dix garçons. Au moment où Hārūn al-Rašīd chargea les ministres, les gouverneurs et les princes d’envoyer leurs enfants à l’école pour y recevoir une instruction, exécutant cet ordre, Aḥmad inscrit tous ses enfants [3] avec ceux des princes, des ministres et des gouverneurs. Ils sortirent diplômés après plusieurs années d’études : certains devinrent des juristes, des lettrés ou des théologiens, d’autres des savants versés dans les traditions prophétiques. Aḥmad al-Baġdādī Ibn Aḥmad se trouvait parmi eux. Le commandeur des croyants Hārūn al-Rašīd a alors recommandé à tous ses savants de s’installer dans les différentes contrées de l’Empire afin de diffuser et de promouvoir l’islam.\n" +

                                "40 Amanji : grand cadi et érudit d’Agadez, il dispose d’une mosquée qui porte encore son nom dans le q (...)\n" +
                                "5411 – Le cheikh, le gnostique, notre maître al-sayyid Amanǧī al-Agadazī. Il est le savant très docte, l’argument des sciences de la raison et de la transmission, le pieux, le dévot, le cheikh Amanǧī b. ʿAbd Allāh al-Aqadazī al-Mālikī. Il étudia la science à Agadez, dans l’Aïr et au Nigeria auprès des cheikhs les plus illustres en science à tel point qu’il la trouva comme un plaisir délicieux et qu’il surpassa tous les étudiants de sa génération40. [31]. Ensuite, il tint un cercle d’enseignement dans la mosquée d’Amaréwatt, un des quartiers d’Agadez. Il reçut un grand nombre de disciples venus de tous les horizons. Il était, que Dieu lui fasse miséricorde, malgré la grandeur de sa distinction et de son rang social élevé, au comble de la modestie et de la contrition (inkisār). Il ôtait le péché qui accablait les gens pour les apaiser.\n" +
                                "62 De son vrai nom, Ousmane Mikitan, sultan qui a régné à Agadez de 1903 à 1907. D’après la liste recueillie par Ibrahim Alanga en 2014 auprès du chef de village d’Ingall - copie conforme à la liste officielle de 2001. D. Hamani, 2006 ; A. Adamou, 1979 ; C. Lefebvre, 2021, p. 217, 243-249.",
                        667799, 500000, 3);
            case 2:
                return new Region(2, "Diffa", "Diffa",
                        R.drawable.ic_region_diffa,
                        "Région située à l'extrême sud-est du pays, frontalière avec le Nigeria et le Tchad. Connue pour le parc national de Diffa et le lac Tchad. Elle est principalement peuplée par les Kanouris et les Peuls.",
                        156906, 600000, 2);
            case 3:
                return new Region(3, "Dosso", "Dosso",
                        R.drawable.ic_region_dosso,
                        "Région agricole par excellence, Dosso est le grenier du Niger avec ses cultures vivrières et son élevage. Elle produit du mil, du sorgho, du niébé et de l'arachide.",
                        31002, 2500000, 5);
            case 4:
                return new Region(4, "Maradi", "Maradi",
                        R.drawable.ic_region_maradi,
                        "Considérée comme la capitale économique du Niger, Maradi est un important centre commercial et agricole. C'est la principale région productrice d'arachide et de bétail.",
                        38581, 3800000, 6);
            case 5:
                return new Region(5, "Niamey", "Niamey",
                        R.drawable.ic_region_niamey,
                        "Capitale du Niger et centre politique, administratif et culturel du pays, située sur les rives du fleuve Niger. Elle abrite les principales institutions du pays et est le siège de nombreuses organisations internationales.",
                        239, 1500000, 1);
            case 6:
                return new Region(6, "Tahoua", "Tahoua",
                        R.drawable.ic_region_tahoua,
                        "Région carrefour entre le nord et le sud, connue pour ses mines d'or et son artisanat traditionnel. Elle est célèbre pour son marché aux bestiaux, l'un des plus importants d'Afrique de l'Ouest.",
                        106677, 3300000, 8);
            case 7:
                return new Region(7, "Tillabéri", "Tillabéri",
                        R.drawable.ic_region_tillaberi,
                        "Région traversée par le fleuve Niger, abritant le parc national du W classé au patrimoine mondial de l'UNESCO. Elle est riche en biodiversité avec de nombreuses espèces animales et végétales.",
                        89623, 3200000, 6);
            case 8:
                return new Region(8, "Zinder", "Zinder",
                        R.drawable.ic_region_zinder,
                        "Ancienne capitale du Niger, Zinder est riche en histoire avec son sultanat et son architecture traditionnelle. Le palais du Sultan et la vieille ville sont des attractions touristiques majeures.",
                        155778, 4300000, 5);
            default:
                return new Region(1, "Agadez", "Agadez",
                        R.drawable.ic_region_agadez,
                        "Région par défaut", 667799, 500000, 3);
        }
    }

    private void displayRegionData(Region region) {
        // Afficher l'image
        imageRegion.setImageResource(region.getImageResource());

        // Afficher les informations de base
        textNom.setText(region.getNom());
        textCapitale.setText("Capitale : " + region.getCapitale());
        textDescription.setText(region.getDescription());

        // Afficher les statistiques
        textSuperficie.setText(region.getSuperficieFormatted());
        textPopulation.setText(region.getPopulationFormatted());
        textDepartements.setText(region.getDepartementsFormatted());

        // Animation d'entrée pour la carte
        cardInfo.setAlpha(0f);
        cardInfo.animate()
                .alpha(1f)
                .setDuration(800)
                .start();
    }

    private void setupToolbar(String regionName) {
        toolbar.setTitle(regionName);
        toolbar.setNavigationOnClickListener(v -> {
            // Retour à l'activité précédente
            onBackPressed();
        });

        // Optionnel : Ajouter un menu
        toolbar.inflateMenu(R.menu.menu_region_detail);
        toolbar.setOnMenuItemClickListener(item -> {
            int id = item.getItemId();
            if (id == R.id.action_share) {
                shareRegionInfo(regionName);
                return true;
            } else if (id == R.id.action_favorite) {
                toggleFavorite();
                return true;
            }
            return false;
        });
    }

    private void shareRegionInfo(String regionName) {
        String shareText = "Découvrez la région de " + regionName + " au Niger !\n" +
                "Une région riche en culture et en histoire.";

        android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareText);
        startActivity(android.content.Intent.createChooser(shareIntent, "Partager via"));
    }

    private void toggleFavorite() {
        // Implémenter la logique des favoris
        android.widget.Toast.makeText(this, "Ajouté aux favoris", android.widget.Toast.LENGTH_SHORT).show();
    }
}