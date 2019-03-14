
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MemeLord
 */
public class Dictionary {
    private List<String> library=new ArrayList<>();
    
    public void init()
    {
        library.add("#");
        for(char c = 'A';c<='Z';c++)
        {
            library.add(Character.toString(c));
        }
    }
    
    public void addLib(String a)
    {
        System.out.println("add "+a+" as element number "+library.size());
        library.add(a);
    }
    
    public String get(int i)
    {
        return library.get(i);
    }
    
    public int find(String a)
    {
        for(int i = 0;i<library.size();i++)
        {
            if(library.get(i).equals(a))
            {
                return i;
            }
        }
        return library.size();
    }
    
    public boolean isFounded(int i)
    {
        return i<library.size();
    }
}
