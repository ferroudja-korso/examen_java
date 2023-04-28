 public class personne{
    private String nom;
    private String  prenom;
    private int age;
    public personne(String nom,int age,String prenom ){
        this.nom=nom;
        this.age=age;
        this.prenom=prenom;
    }

    public String getNom() {
        return nom;
    }
    public int getAge(){
        return age;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAge(int age)    {
        this.age=age;
        }
    public void setPrenom(String prenom){
        this.prenom=prenom;
        }

}
