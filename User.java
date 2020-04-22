//program interface

public class User {
	
	private Lampu lampu;

    public User(Lampu lampu) {
        this.lampu = lampu;
    }
    
    void turnOnTheLamp(){
        this.lampu.powerOn();
    }
    
    void turnOffTheLamp(){
        this.lampu.powerOff();
    }
    
    void makeLampReadMode(){
        this.lampu.modeMembaca();
    }
    
    void makeLampSleepMode(){
        this.lampu.modeTidur();
    }
}

