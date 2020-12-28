

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class WebTree {
	public WebNode root;
	public Pair pair;
	public ArrayList<Pair> arr=new ArrayList<>();
	public ArrayList<Double> arr_nodeScore=new ArrayList<>();
	public WebTree(WebPage rootPage) {
		this.root = new WebNode(rootPage);
	}

	public void setPostOrderScore(ArrayList<Keyword> keywords) throws IOException {
		setPostOrderScore(root, keywords);
	}

	private void setPostOrderScore(WebNode startNode, ArrayList<Keyword> keywords) throws IOException {
		// 4. compute the score of children nodes postorder
		for (WebNode child : startNode.children) {
			child.setNodeScore(keywords);
		}
		// 5.setNode score of startNode
		//print¨S¤ÏÀ³ 
		//System.out.println("Test");
		startNode.setNodeScore(keywords);

	}

	public void eularPrintTree() {
		eularPrintTree(root);
	}

	private void eularPrintTree(WebNode startNode) {
		int nodeDepth = startNode.getDepth();

		if (nodeDepth > 1)
			System.out.print("\n" + repeat("\t", nodeDepth - 1));
		// print "("
		System.out.print("(");
		// print "name","score"
		System.out.print(startNode.webPage.name + "," + startNode.nodeScore);

		// 7.print child preorder
		for (WebNode child : startNode.children) {
			eularPrintTree(child);
		}

		// print ")"
		System.out.print(")");

		/*
		 * for example (Publication,286.2)
		 */
		if (startNode.isTheLastChild())
			System.out.print("\n" + repeat("\t", nodeDepth - 2));

	}

	private String repeat(String str, int repeat) {
		String retVal = "";
		for (int i = 0; i < repeat; i++) {
			retVal += str;
		}
		return retVal;
	}
	public void sort(ArrayList<Double> arr_nodeScore) {
		Collections.sort(arr_nodeScore);
		Collections.reverse(arr_nodeScore);
	}
}

