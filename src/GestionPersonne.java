import java.util.ArrayList;

public interface GestionPersonne {

    class GestionPersonnes {
        // liste des groupe de personnes
        private ArrayList<Etudiant> etudiants;
        private ArrayList<Professeur> professeurs;
        private ArrayList<Secretaire> secretaire ;

        // liste des groupe de personnes

        public GestionPersonnes() {
            // initialisation des listes des personnes
            etudiants = new ArrayList<Etudiant>();
            professeurs = new ArrayList<Professeur>();
            secretaire = new ArrayList<secretaire>();

        }

        public void ajouterEtudiant(Etudiant etudiant) {
            etudiants.add(etudiant);
        }

        public void supprimerEtudiant(Etudiant etudiant) {
            etudiants.remove(etudiant);
        }

        // méthodes similaires pour les autres groupes de personnes

        public void afficherEtudiants() {
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant.toString());
            }
        }

        public void ajouterProfesseur(Professeur professeur) {
            professeur.add(professeur);
        }

        public void supprimerProfesseur(Professeur professeur) {
            professeur.remove(professeur);
        }

        public void afficherProfesseur() {
            for (Professeur professeur : professeur) {
                System.out.println(professeur.toString());
            }
        }
        public void ajoutersecretaire(Secretaire secretaire) {
            secretaire.add(secretaire);
        }

        public void supprimerSecretaire(Secretaire secretaire) {
            secretaire.remove(secretaire);
        }

        // méthodes similaires pour les autres groupes de personnes

        public void afficherSecretaire() {
            for (Secretaire secretaire  : secretaire) {
                System.out.println(secretaire.toString());
            }
        }
    }

}

