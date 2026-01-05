package com.example.histoiredunigeriv;

public class Region {
    private int id;
    private String nom;
    private String capitale;
    private int imageResource;
    private String description;
    private int superficie; // en km²
    private int population; // approximative
    private int nombreDepartements;

    public Region(int id, String nom, String capitale, int imageResource,
                  String description, int superficie, int population,
                  int nombreDepartements) {
        this.id = id;
        this.nom = nom;
        this.capitale = capitale;
        this.imageResource = imageResource;
        this.description = description;
        this.superficie = superficie;
        this.population = population;
        this.nombreDepartements = nombreDepartements;
    }

    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getCapitale() { return capitale; }
    public int getImageResource() { return imageResource; }
    public String getDescription() { return description; }
    public int getSuperficie() { return superficie; }
    public int getPopulation() { return population; }
    public int getNombreDepartements() { return nombreDepartements; }

    // Formatters
    public String getSuperficieFormatted() {
        return String.format("%,d km²", superficie);
    }

    public String getPopulationFormatted() {
        return String.format("%,d hab.", population);
    }

    public String getDepartementsFormatted() {
        return nombreDepartements + " départements";
    }
}
