package vinayak1;

public class Constructor {

	int matches;
	int runs;
	int rank;
	String team;

	public Constructor(int matches,int runs,int rank,String team) {
		this.matches= matches;
		this.runs= runs;
		this.rank= rank;
		this.team= team;
	}

	public void carrer_stats() {
		System.out.println("sachin");
		System.out.println("matches" + matches);
		System.out.println("runs" + runs);
		System.out.println("rank" + rank);
		System.out.println("team" + team);

	}

	public void sourav() {
		System.out.println("indian captain");
		System.out.println("sourav");
		System.out.println("matches" + matches);
		System.out.println("runs" + runs);
		System.out.println("rank" + rank);
		System.out.println("team" + team);

	}

}
