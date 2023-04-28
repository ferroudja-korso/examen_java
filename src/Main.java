import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPersonnes gestionPersonnes = new GestionPersonnes();

        boolean continuer = true;
        while (continuer) {
            System.out.println("Que voulez-vous faire ? (1: ajouter, 2: supprimer, 3: afficher, 4: quitter)");
            int choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Quel groupe de personne voulez-vous ajouter ? (1: étudiant, 2: professeur)");
                    int groupe = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Entrez le nom de la personne :");
                    String nom = scanner.nextLine();
                    System.out.println("Entrez le prénom de la personne :");
                    String prenom = scanner.nextLine();
                    System.out.println("Entrez l'age de la personne :");
                    String adresse = scanner.nextLine();
                    if (groupe == 1) {
                        System.out.println("Entrez le numéro étudiant de l'étudiant :");
                        int numeroEtudiant = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Entrez la filière de l'étudiant :");
                        String filiere = scanner.nextLine();

                        Etudiant etudiant = new Etudiant(nom, prenom, age, numeroEtudiant, filiere);
                        gestionPersonnes.ajouterEtudiant(etudiant);
                    } else if (groupe == 2) {
                        System.out.println("Entrez le numéro de bureau du professeur :");
                        int numeroBureau = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Entrez le domaine de recherche du professeur :");
                        String domaineRecherche = scanner.nextLine();
                        Professeur professeur = new Professeur(nom, prenom, age, numeroBureau, domaineRecherche);
                        gestionPersonnes.ajouterProfesseur(professeur);
                    } else {
                        System.out.println("Groupe de personne non reconnu");
                    }
                    break;
                case 2:
                    System.out.println("Quel groupe de personne voulez-vous supprimer ? (1: étudiant, 2: professeur)");
                    groupe = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Entrez le nom de la personne à supprimer :");
                    nom = scanner.nextLine();
                    System.out.println("Entrez le prénom de la personne à supprimer :");
                    prenom = scanner.nextLine();
                    if (groupe == 1) {
                        Etudiant etudiant = gestionPersonnes.rechercherEtudiant(nom, prenom);
                        if (etudiant != null) {
                            gestionPersonnes.supprimerEtudiant(etudiant);
                        } else {
                            System.out.println("Etudiant non trouvé");
                        }
                    } else if (groupe == 2) {
                        Professeur professeur = gestionPersonnes.rechercherProfesseur(nom, prenom);
                        if (professeur != null) {
                            gestionPersonnes.supprimerProfesseur(professeur);
                        } else {
                            System.out.println("Professeur non trouvé");
                        }
                    } else {
                        System.out.println("Groupe de personne non reconnu");

                    }
            }
        }

    }
}