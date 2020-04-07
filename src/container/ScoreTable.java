package container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ScoreTable {
	private HashMap<String, HashMap<String, Double>> scoretable = new HashMap<String, HashMap<String, Double>>();
	
	public void put(String name, String subject, Double score){
		if(scoretable.containsKey(name))
			scoretable.get(name).put(subject, score);
		else{
			HashMap<String, Double> thisscore = new HashMap<String, Double>();
			thisscore.put(subject, score);
			scoretable.put(name, thisscore);
			}
	}
	
	public String getSomebodysTranscript(String name){
		return scoretable.get(name).toString();
	}
	
	public String getScoresOfSubject(String subject){
		HashMap<String, Double> scores = new HashMap<String, Double>();
		for(String name:scoretable.keySet()){
			scores.put(name, scoretable.get(name).get(subject));
		}
		return scores.toString();
	}
	
	public String toString(){
		return scoretable.toString();
	}
	public static void main(String[] args) {
		ScoreTable table = new ScoreTable();
		table.put("ZhangSan", "Java", 60.0);
		table.put("ZhangSan", "Math", 80.0);
		table.put("LiSi", "Java", 70.0);
		System.out.println("Java scores: "+table.getScoresOfSubject("Java"));
		System.out.println("ZhangSan score: "+table.getSomebodysTranscript("ZhangSan"));
		System.out.println("Whole table: "+table);
	}

}