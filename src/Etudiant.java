 class Etudiant extends personne {
    private int numeroEtudiant;
    private String filiere;


    public Etudiant(String nom, String prenom, int age, int numeroEtudiant, String filiere) {
        super(nom, prenom, age);
        this.numeroEtudiant = numeroEtudiant;
        this.filiere = filiere;


    }
}
