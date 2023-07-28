
//importing the required libraries
import java.util.*;
public class VotingMachine {
    private String candidate;
    private String castVote;
    private int results;



//    List of candidates
    ArrayList<Candidate>candidates= new ArrayList<>();

    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }
    public ArrayList<Candidate> addCandidate() {
        return candidates;
    }
    public ArrayList<Candidate> printResults() {
        return printResults();
    }

    public VotingMachine(String candidate, String castVote, int results) {
        this.candidate = candidate;
        this.castVote = castVote;
        this.results = results;
    }

//    public String addCandidate(){
//        return candidate;
//    }
    public String castVote(){
        return castVote;
    }
    public void PrintResults(String name, int votes){

        System.out.println("This prints the results the candidate has got:\n"+
                "Name of the candidate:"+name+"\n Number of votes"+votes);
    }
}
