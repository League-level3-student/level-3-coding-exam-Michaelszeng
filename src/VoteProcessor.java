import java.util.ArrayList;

public class VoteProcessor {
	
	public String calculateElectionWinner(ArrayList<String> votes) {
		int numFrancis = 0;
		int numSnowden = 0;
		for (int i=0; i<votes.size(); i++) {
			votes.set(i, votes.get(i).toLowerCase());
			if (votes.get(i).equals("pope francis")) {
				numFrancis++;
			}
			else {
				numSnowden++;
			}
		}
		
		if (numFrancis == numSnowden) {
			return "TIE";
		}
		else if (numFrancis > numSnowden) {
			return "pope francis";
		}
		
		else {
			return "edward snowden";
		}

	}
	
}
