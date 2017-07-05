import java.util.ArrayList;

	class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class FlattenBinaryToLinkedList {
	public void flatten(TreeNode root) {
        ArrayList<TreeNode> list=new ArrayList();
        getPreorder(root, list);
        for (int i = 0; i < list.size()-1; i++) {
			TreeNode node=list.get(i);
			node.left=null;
			node.right=list.get(i+1);
		}
        if (list.size()>0){
        	TreeNode node = list.get(list.size()-1);
        	node.left=node.right=null;
        }
    }
	public void getPreorder(TreeNode root,ArrayList<TreeNode> list){
		if (root==null)
			return;
		list.add(root);
		getPreorder(root.left, list);
		getPreorder(root.right, list);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
