

public class TreeBinaryNode{
	private String info;
	private TreeBinaryNode left;
	private TreeBinaryNode right;
	public TreeBinaryNode(String info) {
		setInfo(info);
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public TreeBinaryNode getRight() {
		return right;
	}
	public void setRight(TreeBinaryNode next) {
		this.right = next;
	}
	public TreeBinaryNode getLeft() {
		return left;
	}
	public void setLeft(TreeBinaryNode next) {
		this.left = next;
	}
}
