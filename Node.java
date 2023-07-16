// Matthew Stone
// Co Sci 452
// Final - Chat Bot
import java.util.*;
class Node
{
    private String data;
    private Node lchild;
    private Node rchild;
    public Node()
    {
        data = null;
        this.lchild = null;
        this.rchild = null;
    }
    public Node(String line){
        this.data = line;
        this.lchild = null;
        this.rchild = null;
    }
    public void insert(Node root, Node next)
    {
        this.lchild = root;
        this.rchild = next;
    }
    public String getData()
    {
        return data;
    }
    public Node getRchild()
    {
        return rchild;
    }
    public Node getLchild()
    {
        return lchild;
    }
}
class game
{
    String input;
    String line = "Do you want to go swimming?";
    Node memory = new Node(line);
    Node root = memory;
    public void gamer( boolean starter)
    {
        while (starter)
        {
            session(root);
        }
    }
    public void session(Node node)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Alex: " + node.getData());
        System.out.print("You: ");
        String input = sc.nextLine();
        if( (input.equalsIgnoreCase("no")) )
        {
            if( node.getLchild() == null)
            {
                System.out.println("");
                System.out.println("Alex: I give up, what did you want to do?");
                System.out.print("You: ");
                String activity = sc.nextLine();
                System.out.println("");
                activity = "Would you like to go " + activity;
                Node next = new Node(activity);
                System.out.println("");
                System.out.println("Type a question for which the answer is Yes for " + " ' " + node.getData() + " ' " +" but No for " + activity);
                System.out.print("You: ");
                input = sc.nextLine();
                Node hub = new Node(input);
                hub.insert(root, next);
                root = hub;
                System.out.println("");
                System.out.println("Alex: Want to play again?");
                System.out.print("You: ");
                input = sc.nextLine();
                if( (input.equalsIgnoreCase("no")) )
                {
                     System.exit(0);
                }
            }
            else
            {
                session(node.getLchild());
            }
        }
        else
        {
            if (node.getRchild() != null)
            {
                session(node.getRchild());
            }
            else
            {
                if (!(input.equalsIgnoreCase("no")))
                {
                    System.out.println("");
                    System.out.println("Alex: I WIN! Want to play again?");
                    System.out.print("You: ");
                    input = sc.nextLine();
                    if( (input.equalsIgnoreCase("no")) )
                    {
                        System.exit(0);
                    }
                } 
            }
        }
    }
}