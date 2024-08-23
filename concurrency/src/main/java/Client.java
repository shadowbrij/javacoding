import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        IB obj = new InterviewBit();
        obj.getData();
    }
}

class IB
{
    protected void getData(){
        System.out.println("Inside IB");
    }
}

class InterviewBit extends IB{
    protected void getData(){
        System.out.println("Inside InterviewBit");
    }
}