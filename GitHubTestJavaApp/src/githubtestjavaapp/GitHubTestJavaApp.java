package githubtestjavaapp;

public class GitHubTestJavaApp {

    public static void main(String[] args) 
    {
        System.out.println("Hello Java!");
        
        SortAlgorithms a = new SortAlgorithms(100) ;
        
        a.insert(12) ;
        a.insert(34);
        a.insert(2);
        a.insert(556);
        a.insert(45);
        
        a.display();
        
        System.out.println("My name is Nazira!") ;
        
    
    }
}
