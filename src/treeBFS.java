import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class treeBFS {
    public static void main(String[] args) {
        tree root=new tree("1");
        tree rootChild1=root.addChildNode(new tree("2"));
        tree rootChild2=root.addChildNode(new tree("3"));
        tree leaf1=root.addChildNode(new tree("4"));
        tree leaf2=root.addChildNode(new tree("5"));

        ArrayList<String> output=bfs(root);
        //[1,2,3,4,5]

        leaf1.addChildNode(new tree("6"));
        rootChild2.addChildNode(new tree("7"));
        ArrayList<String> output2=bfs(root);

        System.out.println(output2);
        //         1
        //        2 3
        //       4 5  7
        //      6
        //[1,2,3,4,5,7,6]




    }

    private static ArrayList<String> bfs(tree node) {
        //큐형태로 받으면 각 층마다 받기가 쉬움
        Queue<tree> queue=new LinkedList<>();
        ArrayList<String> values=new ArrayList<>();
        queue.add(node);
        //상위 노드를 받고 하위 노드를 받음
        while(queue.size()>0){
            tree curNode=queue.poll();

            values.add(curNode.getValue());

            if(curNode.getChildren()!=null){
                queue.addAll(curNode.getChildren());
            }
        }

        return values;
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
            return  children.get(children.size()-1);
        }
        public String getValue(){ return value;}

        public ArrayList<tree> getChildren() {return children;}

    }
}
