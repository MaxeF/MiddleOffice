package sparkexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuestionnaireTest {

	@Test
	void test() {
		
		//Cr�ation classe demande
		String[] reponses = {"Bleu", "Rouge", "Jaune", "Vert"};
				
		Demande demande = new Demande("Quelle est votre couleur pr�f�r�e ?", reponses);
		
		//Cr�ation classe questionnaire
		Questionnaire quest = new Questionnaire();
		
		quest.demandes.add(demande);
	}

}
