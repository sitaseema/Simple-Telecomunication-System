class MobilePhone implements Telephone{


  private String number;
  private boolean isRinging;
  private boolean isPowerOn;


    MobilePhone(String number)
    {
        this.number=number;
    }


     public  void powerOn()
     {
        isPowerOn=true;
        System.out.println("Mobile phone is  power on ...");
     }
    public void dialNumber(){
        System.out.println("dialing number "+number+"  and phone is ringing");

        isRinging=true;
    }

    public void answerPhone()
    {
       
        if(isRinging && isPowerOn)
        {
            System.out.println("aswering the phone...");
            isRinging=false;
        }
        else{
            System.out.println("phone is not ringing or power is not on...");
        }
    }
    public void callPhone(String num){
       
       System.out.println("calling number :"+num);
       
        if(number==num  && isPowerOn)
        {
            dialNumber();
        }
        else{
            System.out.println("wrong number or power is not on...");
        }
    }
    public boolean isRinging(){
        return isRinging;
    }
}