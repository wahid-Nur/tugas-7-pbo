//program interface 

public class moonLamp implements Lampu {

    private boolean isPowerOn;
    
    public moonLamp() {
        // set volume awal
        
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Lampu menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Lampu dimatikan");
    }

    @Override
    public void modeMembaca() {
        if (isPowerOn) {
            System.out.println("Lampu berada di mode membaca");
           
        } else {
            System.out.println("Lampu belum di nyalakan");
        }
    }

    @Override
    public void modeTidur() {
        if (isPowerOn) {
            System.out.println("Lampu berada di mode tidur");
        } else {
            System.out.println("Lampu belum dinyalakan");
        }
    }

}
