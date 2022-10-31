import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        boolean output=balancedBrackets("(");
        System.out.println("output: "+output);//->false

        boolean output1=balancedBrackets("()[]{}");
        System.out.println("output1: "+output1);//->true

        boolean output2=balancedBrackets("({)[]}");
        System.out.println("output2: "+output2);//->false

    }

    public static boolean balancedBrackets(String str){
        if(str.length()==0) return true;


        //스택으로 선언
        Stack<Character> stack=new Stack<>();//()괄호에 대한 스택
        boolean stackClose=false;
        Stack<Character> stack1=new Stack<>();//{}괄호에 대한 스택
        Stack<Character> stack2=new Stack<>();//[]괄호에 대한 스택



        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            //열린 갈호 처리
            if(c=='('){
                stack.push(c);
            }
            else if(c=='{'){
                stack1.push(c);
            }
            else if(c=='['){
                stack2.push(c);
            }
            //닫힌 갈호에 대한 처리
            //닫힌 갈호 처리시 문자열의 모든 곳을 봐야 하므로 다른 클래스를 지정
            else if(c==')'){
                //앞에 열린 괄호가 없을 경우
                if (stack.empty()) return false;
                //앞에 열린 괄호가 있을 경우 pop해서 stack을 비우기
                else if (stack.peek()=='('){
                    stack.pop(); stackClose=true;
                }else return false;
            }
            else if(c=='}'){
                //앞에 열린 괄호가 없을 경우
                if (stack1.empty()) return false;
                    //앞에 열린 괄호가 있을 경우 pop해서 stack을 비우기
                else if (stack1.peek()=='{'){
                    stack1.pop(); stackClose=true;
                }else return false;
            }
            else if(c==']'){
                //앞에 열린 괄호가 없을 경우
                if (stack2.empty()) return false;
                    //앞에 열린 괄호가 있을 경우 pop해서 stack을 비우기
                else if (stack2.peek()=='['){
                    stack2.pop(); stackClose=true;
                }else return false;
            }

        }


        return (stack1.empty()&stack2.empty()&stack.empty());
    }

}
