public class Candidate extends VotingMachine{
    private String name;
    private int numberOfVotes;

    public Candidate(String candidate, String castVote, int results) {
        super(candidate, castVote, results);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }
    public void addVotes(int votes){
        votes+=numberOfVotes;
    }
}
