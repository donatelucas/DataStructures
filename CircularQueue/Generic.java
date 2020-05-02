public class Generic<T>{
    T o;

    Generic (T o) {
        this.o = o;
    }

    public T getObject(){
        return this.o;
    }
}
