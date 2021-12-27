public class Main {
    public static void main (String [] args) {
        int  сlientAccount = 100; // остаток на чсете клиента
        System.out.println ("Начальный счет:" + сlientAccount);
        int accountReplenished  = 3000; // сумма пополнения
        int bonus=0;
        int totalAccount =0;
        
        if  (accountReplenished>=1000)
        {
            bonus=accountReplenished/100;
            totalAccount = сlientAccount+accountReplenished+bonus;
            System.out.println ("Итоговый счет с бонусоми =" + totalAccount);
        }
        else
        {
            totalAccount = сlientAccount+accountReplenished;
            System.out.println ("Итоговый счет без бонусов =" + totalAccount);
        }

    }

}
