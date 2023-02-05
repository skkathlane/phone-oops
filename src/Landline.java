public class Landline implements Phone{

    private  String PhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String PhoneNo) {
        this.PhoneNo = PhoneNo;
        isRinging =false;
        isPowerOn=true;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public boolean powerOn() {
        return true;
    }

    @Override
    public void callNumber(String number) {
       if(isPowerOn){
           System.out.println("You are dialing :"+number);
       }
       else{
           System.out.println("Your Phone is off");
       }
    }

    @Override
    public void receiveNumber(String dialNo) {
        if(isPowerOn && PhoneNo.equals(dialNo)){
            this.isRinging=true;
            System.out.println("hey"+PhoneNo+"You are receiving call ");
        }
        else{
            System.out.println("Power off");
        }

    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call answered");
            this.isRinging=false;
            return true;
        }
        else{
            System.out.println("your Phone is off");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
//        if(isRinging==true){
//            return true;
//        }
//        return false;
        return isRinging;
    }
}
