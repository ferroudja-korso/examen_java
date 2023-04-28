
public class Secretaire extends personne {
    private int numerobureau;
    private int  numdepartement;

    // constructeurs
    public Secretaire() {
        super(); // initialisation des attributs spécifiques de manière aléatoire si nécessaire
    }

    public Secretaire(String nom, String prenom, int age, int numeroEtudiant, String filiere) {
        super(nom, prenom, age);
        this.numerobureau = numerobureau;
        this.departement = departement;
    }
}