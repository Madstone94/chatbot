// Matthew Stone
// Co Sci 452
// final - chatbot
import java.util.*;
public class dosomething
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to do something?");
        String start = sc.nextLine();
        boolean starter;
        if ( start.equalsIgnoreCase("Yes") )
        {
            starter = true;
            game game = new game();
            game.gamer( starter );
        }
    }
}
