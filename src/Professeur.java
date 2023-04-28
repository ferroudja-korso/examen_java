public class Professeur extends personne {

    private int numeroBureau;
    private String domaineRecherche;

    // constructeurs
    public Professeur() {
        super(); // initialisation des attributs spécifiques de manière aléatoire si nécessaire
    }

    public Professeur(String nom, String prenom, int age, String filiere, String matiere) {
        super(nom, prenom, age);
        this.numeroBureau = numeroBureau;
        this.domaineRecherche = domaineRecherche;
    }
}
