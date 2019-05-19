import java.util.HashMap;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int numCommon = 0;
		for (String s1 : hashmap1.keySet()) {
			for (String s2 : hashmap2.keySet()) {
				if (s1.equals(s2) && (hashmap1.get(s1).contentEquals(hashmap2.get(s2)))) {
					numCommon++;
				}
			}
		}
		return numCommon;
	}
}
