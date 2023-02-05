public interface Phone {
    boolean powerOn();
    void callNumber(String number);
    void receiveNumber(String dialNo);
    boolean answerCall();
    boolean isRinging();
}
