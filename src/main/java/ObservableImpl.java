import java.util.ArrayList;

public class ObservableImpl implements Observable {

    // relation oneToMany donc on declare une liste d'observer .
    private ArrayList<Observer> observers = new ArrayList<>();
    private int stsate = 15;

    @Override
    public void subscibe(Observer o) {
        this.observers.add(o);

    }

    @Override
    public void unSubscribe(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }

        /*************************** le cas ou c'est le methode push**************************************/
        /*
        *  @Override
        public void notifyObservers() {
        for(Observer o:observers){
            o.update(this.state);  // on pousse directempent l'information
        }*/
        /**************************************************************************************************/
    }

    public void setStsate(int stsate) {
        this.stsate = stsate;
        this.notifyObservers();
    }

    public int getStsate() {
        return stsate;
    }
}
