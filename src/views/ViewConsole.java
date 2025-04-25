package views;
import models.*;

public class ViewConsole {
    
    public void printArray(Persona[] personas){
        for(Persona p: personas){
            System.out.println(personas[p].toString());
        }
    }
}
