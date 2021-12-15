package chapter7;

import java.io.IOException;

public class SampleService {

    public void sample(){
        ACMEPort acmePort = new ACMEPort();

        try {
            acmePort.open();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void localPort(){
        LocalPort localPort = new LocalPort();

        try {
            localPort.open();
        }catch (CustomException e){

        }
    }
}
