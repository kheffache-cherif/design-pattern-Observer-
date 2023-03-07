public class AppTest {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();  // on un observé
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        Observer o3 = new ObserverImpl1();

        observable.subscibe(o1); // 2- observer  o1 a souscrit  o note observable
        observable.subscibe(o2);
        observable.subscibe(o3);

        observable.setStsate(55);  // 1- l'etat a changé -- lobserver doit etre subscibe .
        observable.setStsate(30);
        System.out.println("----------------**********Unsubscribe**************** -----------------");
        observable.unSubscribe(o1);

        // creation d'un observateur anonymmmmm
        observable.subscibe(new Observer() {
            @Override
            public void update(Observable observable) {
                System.out.println(" je suis l'observzteur anonyme 1");
            }
        });

        // creation d'un observateur anonyme avec l'expession lamda
        observable.subscibe(obs ->{
            System.out.println(" je suis l'observzteur anonyme 2 ");

        });
        observable.setStsate(100);
    }
}
