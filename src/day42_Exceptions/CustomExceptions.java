package day42_Exceptions;


class FadyException extends RuntimeException{ // custom unchecked exception
// once runtime exception classı inherit ettik o nedenle aşagıda throw ile yeni nesne oluşturmamıza izin verdi
    public FadyException(){ // metod overload yaptık bunu çağırınca aşağıdaki yazdırır
        super("Time for a short break");
    }

    public FadyException(String message){ // // metod overload yaptık bunu çağırınca aşağıdaki yazdırır
        super(message);// runtime da bu cons vardı zaten parentten super ile cagırdık
    }

}


class NoBreakException extends Exception{ // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args)  {

        // throw new FadyException("It's time for lunch break");


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }

}