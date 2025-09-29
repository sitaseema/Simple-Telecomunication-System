class DeskPhone implements Telephone{


    private String number;
    private boolean isRinging;

    DeskPhone(String number)
    {
        this.number=number;
    }


     public  void powerOn()
     {
        System.out.println("Desk phone is always power on ...");
     }
    public void dialNumber(){
        System.out.println("dialing number "+number+"  and phone is ringing");

        isRinging=true;
    }

    public void answerPhone()
    {
       
        if(isRinging)
        {
            System.out.println("aswering the phone...");
            isRinging=false;
        }
        else{
            System.out.println("phone is not ringing...");
        }
    }
    public void callPhone(String num){
       
       System.out.println("calling number :"+num);
       
        if(number==num)
        {
            dialNumber();
        }
        else{
            System.out.println("wrong number...");
        }
    }
    public boolean isRinging(){
        return isRinging;
    }
}