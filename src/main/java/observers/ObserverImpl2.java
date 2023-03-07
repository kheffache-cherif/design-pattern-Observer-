package observers;

import observers.Observer;
import obsevable.Observable;
import obsevable.ObservableImpl;

public class ObserverImpl2 implements Observer {
    private int compteur;
    @Override
    public void update(Observable observable) {

        int state = ((ObservableImpl)observable).getStsate(); // l'objet de type observable que je caste vers sa class et je recuper getState
        if(state%2==0) ++compteur;
        System.out.println("************** implimentation 2*****************  ");
        System.out.println("nouvelle mise à jour : state = "+state);
        System.out.println("resultat du calcul est égal =" +((state%2)==0?"Pair" : "Impair"));
        System.out.println("le compteur rst de : "+compteur);
        System.out.println("************************************************ ");

    }
}
