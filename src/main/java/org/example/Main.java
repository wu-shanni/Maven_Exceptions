import org.example.NotFound;

void main() throws Exception{

    //    try {
    //        throw new Exception("Eccezione");
    //    } catch(Exception e) {
    //        IO.println("Lancia eccezione: " + e.getMessage());
    //    }


    //    try{
    //        f();
    //    } catch (Exception e){
    //        IO.println(Arrays.toString(e.getStackTrace()));
    //    }

//        try{
//            f();
//        } catch (NotFound e){
//            IO.println(e.getStatusCode());
//        }

    }

    static void f(){
        g();
    }

    private static void g(){
        h();
    }

    private static void h(){
        throw new NotFound("eccezioniii");      // IllegalArgumentException ---> non è prevedibile
    }