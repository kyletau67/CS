public class BigSib {
    private String HelloMsg;
    public static void main(String[] args) {
    }
    public String greet(String name) {
	String thing;
	    thing = HelloMsg;
	    thing += " ";
	    thing += name;
	return thing; }
    public void setHelloMsg(String NewMsg) {
	HelloMsg = NewMsg;
	    }
}
