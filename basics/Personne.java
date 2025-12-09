public class Personne {
    // Attributs privés
    private String nom;
    private String prenom;
    private int age;

    // Constructeur par défaut
    public Personne() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Validation de l'âge
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif");
        }
    }

    // Méthode pour présenter la personne
    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom +
                " et j'ai " + age + " ans.");
    }

}