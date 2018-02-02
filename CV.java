import java.util.Arrays;

public class CV {

public static String nom, prenom, formation, attentes;
	public static int experienceTravail;
	public static String[] competences;

	public CV(String nom, String prenom, String formation, String attentes, int experienceTravail,
			String[] competences) {
		CV.nom = nom;
		CV.prenom = prenom;
		CV.formation = formation;
		CV.attentes = attentes;
		CV.experienceTravail = experienceTravail;
		CV.competences = competences;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public static void afficher() {
		System.out.println("Nom: " + prenom + " " + nom + "\nFormation: " + formation
				+ "\nAnnées d'experiences de travail: " + experienceTravail + "\nCompétences: "
				+ Arrays.toString(competences) + "\nAttentes vis à vis le cours: " + attentes);
	}
	}