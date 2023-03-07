public interface Observable {  // observé subject , publisher )

    // c'est le sujet il deffenit 03 methodes


    public void  subscibe(Observer o) ;//addObserver();  resoit un objet de type observer.
    public void unSubscribe(Observer o); //removeObserver
    public void notifyObservers (); // sendNotification


}
