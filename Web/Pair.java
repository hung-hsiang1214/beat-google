public class Pair {

	public String webnodeName;
	public double nodescore;

	public Pair(String webnodeName, double nodescore) {
		this.webnodeName = webnodeName;
		this.nodescore = nodescore;
	}

	public String getWebNode() {
		return webnodeName;
	}

	public double getNodeScore() {
		return nodescore;
	}
	public String getWebNode(double nodescore) {
		return webnodeName;
	}

	public double getNodeScore(String webnodename) {
		return nodescore;
	}
}
