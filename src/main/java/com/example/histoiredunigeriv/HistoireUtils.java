package com.example.histoiredunigeriv;

import android.content.Context;
import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HistoireUtils {

    public static String lireHistoireNiger(Context context) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            // Ouvrir le fichier depuis raw
            InputStream inputStream = context.getResources()
                    .openRawResource(R.raw.hhh);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream, "UTF-8"));

            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            reader.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            return "Impossible de charger l'histoire du Niger.";
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return "Fichier d'histoire non trouvé.";
        }

        return stringBuilder.toString();
    }

    // Méthode pour lire des sections spécifiques
    public static String getSection(Context context, String sectionTitle) {
        String fullText = lireHistoireNiger(context);
        String[] sections = fullText.split("## ");

        for (String section : sections) {
            if (section.startsWith(sectionTitle)) {
                return section;
            }
        }

        return "Section non trouvée.";
    }
}

