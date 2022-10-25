import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class treeDFS {


    public static void main(String[] args) {
        treeDFS.tree root=new treeDFS.tree("1");
        treeDFS.tree rootChild1=root.addChildNode(new treeDFS.tree("2"));
        treeDFS.tree rootChild2=root.addChildNode(new treeDFS.tree("3"));
        treeDFS.tree leaf1=rootChild1.addChildNode(new treeDFS.tree("4"));
        treeDFS.tree leaf2=rootChild1.addChildNode(new treeDFS.tree("5"));

        /*              1
        *             2   3
        *           4  5
        *
        * */
        ArrayList<String> output=dfs(root);
        //System.out.println(output);//->[1,2,4,5,3]

        System.out.println(root.children);


        /*              1
         *             2   3
         *           4 5   7
         *         6
         * */
        leaf1.addChildNode(new treeDFS.tree("6"));
        rootChild2.addChildNode(new treeDFS.tree("7"));
        output=dfs(root);
        //System.out.println(output);//[1,2,4,6,5,3,7]

    }

    public static ArrayList<String> dfs(tree node){
        ArrayList<String> dfsResult=new ArrayList<>();
        dfsResult.add(node.getValue());//root이 들어오므로 가장 먼저 root을 더해줌
        //자식 노드가 없을 때
        if (node.getChildren()!=null) {
            for(int i=0;i<node.getChildren().size();i++){
                //현재 커서의 위치
                ArrayList<String> curList=dfs(node.getChildren().get(i));
                dfsResult.addAll(curList);
            }
        }
        return dfsResult;


    }

    public static class tree{
        private String value;
        private ArrayList<tree> children;

        public tree(String data){
            this.value=data;
            this.children=null;
        }

        public tree addChildNode(tree node){
            if(children==null) children=new ArrayList<>();
            children.add(node);
            return children.get(children.size()-1);
        }

        public String getValue(){
            return value;
        }

        public ArrayList<tree> getChildren(){
            return children;
        }
    }
}
