package chapter7;

import java.io.IOException;

public class LocalPort {

    private ACMEPort acmePort;

    public void open(){
        try {
            acmePort.open();
        } catch (IOException e) {
            throw new CustomException(e);
        } catch (Exception e){
            throw new CustomException(e);
        }
    }
}
