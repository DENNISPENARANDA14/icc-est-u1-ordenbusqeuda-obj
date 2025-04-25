package controllers;

import models.Persona;

public class PersonaController {
    
    public void sortByDireccionCodigo(Persona[] personas){

        for (int i = 0; i < personas.length; i++) {
            int indexMayor = i;
            for (int j = (i+1); j < personas.length; j++) {
                //if(personas[j].getCodigoDireccion()>personas[indexMayor].getCodigoDireccion()){
                if (personas[j].compareCodigoDireccion(personas[i])) {
                    indexMayor=j;
                }
            }
            if(i!=indexMayor){
                Persona aux = personas[indexMayor];
                personas[indexMayor]=personas[i];
                personas[i]=aux;
            }
        }
    }

    public Persona findPersonaByCodigo(Persona[] personas, int codigo){
        int bajo=0;
        int alto = personas.length -1;

        while(bajo<alto){
            int center =(bajo +alto)/2;
            if(personas[center].equalsByCodigoDireccion(center)){
                return personas[center];
            }else if (personas[center].compareCodigoDireccion(codigo)) {
                bajo=center+1;
                
            }else{
                alto = center-1;
            }
        }
        
    }
}
