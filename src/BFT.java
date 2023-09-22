public class BFT<E> {

    E first;

    E second;

    public BFT() {
       first = null; second = null;
    }

    public int getCount(){
        if (first == null && second == null)
            return 0;
        if (first == null || second == null)
            return 1;
        return 2;
    }

    public void put(E obj){
        if(getCount() == 0)
            first=obj;
        else
        if (getCount()==1)
            if(first == null)
                first = obj;
            else
                second= obj;
        else
            //if (getCount()>1)
            System.out.println("коробка уже занята");

    }

    @Override
    public String toString() {
        return "BFT{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
