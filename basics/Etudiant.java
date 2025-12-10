    public class Etudiant {

        private String nom;
        private String prenom;
        private Filiere filiere;

        public Etudiant(String nom, String prenom , Filiere filiere) {
            this.nom = nom;
            this.prenom = prenom;
            this.filiere = filiere;
        }

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

        public Filiere getFiliere() {
            return filiere;
        }

        public void setFiliere(Filiere filiere) {
            this.filiere = filiere;
        }

    }
