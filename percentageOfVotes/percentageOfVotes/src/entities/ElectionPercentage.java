package entities;

public class ElectionPercentage {

	private int validVotes;
	private int blankVotes;
	private int nullVotes;
	
	
	public ElectionPercentage(int validVotes, int blankVotes, int nullVotes) {
		super();
		this.validVotes = validVotes;
		this.blankVotes = blankVotes;
		this.nullVotes = nullVotes;
	}

	
	
	public int getValidVotes() {
		return validVotes;
	}



	public void setValidVotes(int validVotes) {
		this.validVotes = validVotes;
	}



	public int getBlankVotes() {
		return blankVotes;
	}



	public void setBlankVotes(int blankVotes) {
		this.blankVotes = blankVotes;
	}



	public int getNullVotes() {
		return nullVotes;
	}



	public void setNullVotes(int nullVotes) {
		this.nullVotes = nullVotes;
	}



	public int totalVoters() {
		return validVotes + blankVotes + nullVotes;
	}
	
	public double validVotes() {
		return (this.validVotes * 100) / totalVoters();
	}
	
	public double blankVotes() {
		return (this.blankVotes * 100) / totalVoters();
	}
	
	public double nullVotes() {
		return (this.nullVotes * 100) / totalVoters();
	}
	
}
