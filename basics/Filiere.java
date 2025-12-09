public class Filiere {

    private String code;
    private String libelle;

    public Filiere(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
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

    public void setNom(String libelle) {
        this.libelle = libelle;
    }
}
