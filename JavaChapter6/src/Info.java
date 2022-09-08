public class Info<T>{
    private T info;

    public Info(T info){
        this.info=info;
    }

    public  T getInfo(){
        return this.info;
    }
}

//// complier.JVM
//public class Info {
//    private Object info;
//
//    public Info(Object info){
//        this.info=info;
//    }
//
//    public  Object getInfo(){
//        return this.info;
//    }
//}
