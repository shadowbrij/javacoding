package abstractFactory.concept;

public class IM {
    I ref;
    public void setRef(I obj){
        ref = obj;
    }

    public void go(){
         ref.doWork();
    }

}
