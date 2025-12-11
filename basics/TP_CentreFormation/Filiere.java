public class Filiere {

    private String code;
    private String libelle;
    private Enseignant formateur;

    public Filiere(String code, String libelle, Enseignant formateur) {
        this.code = code;
        this.libelle = libelle;
        this.formateur = formateur;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Enseignant getFormateur() {
        return formateur;
    }

    public void setFormateur(Enseignant formateur) {
        this.formateur = formateur;
    }

    @Override
    public String toString() {
        return "Filière : " + getLibelle();
    }
}
