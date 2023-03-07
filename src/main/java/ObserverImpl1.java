public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getStsate(); // l'objet de type observable que je caste vers sa class et je recuper getState
        double res = state * state + 10;
        System.out.println("******************* implimentation 1 ***************** ");
        System.out.println("nouvelle mise à jour : state = " + state);
        System.out.println("resultat du calcul est egal =" + res);
        System.out.println("******************************************************");
    }

        /*************************** le cas ou c'est le methode push**************************************/

        /*

        @Override
        public void update(int state) {
          //  int state = ((ObservableImpl) observable).getStsate(); // l'objet de type observable que je caste vers sa class et je recuper getState
            double res = state * state + 10;
            System.out.println("******************* implimentation 1 ***************** ");
            System.out.println("nouvelle mise à jour : state = " + state);
            System.out.println("resultat du calcul est egal =" + res);
            System.out.println("******************************************************");
        }
*/




}
