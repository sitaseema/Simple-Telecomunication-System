class Main{

    public static void main(String[] args)
    {
        DeskPhone p1=new DeskPhone("12345");

        p1.powerOn();
        p1.callPhone("12345");
        p1.answerPhone();
        p1.answerPhone();

      System.out.println("\n\n"+" ***************************************\n");

        MobilePhone p2=new MobilePhone("54321");

        p2.powerOn();
        p2.callPhone("54321");
        p2.answerPhone();
        p2.answerPhone();

    }
}