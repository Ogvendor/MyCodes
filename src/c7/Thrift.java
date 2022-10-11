package c7;

public class Thrift {
    private String[] participantList;
    private double amount;
    private int lengthOfParticipant;


    public Thrift(int lengthOfParticipant, double amount){
        this.lengthOfParticipant = lengthOfParticipant;
        participantList =  new String[this.lengthOfParticipant];
        this.amount = amount;
    }

    public String[] getParticipantList() {
        return participantList;
    }

    public void setParticipantList(String[] participantList) {
        this.participantList = participantList;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getLengthOfParticipant() {
        return lengthOfParticipant;
    }

    public void setLengthOfParticipant(int lengthOfParticipant) {
        this.lengthOfParticipant = lengthOfParticipant;
    }
}
