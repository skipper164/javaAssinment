import java.util.Scanner;
public class Phone {
public static void main(String[] arg) {
Scanner input = new Scanner(System.in);

 String menu = """
 1. phone book        7. call divert
 2. messages          8. Games
 3. chat              9. calculator
 4. call register     10. reminders
 5. Tones             11. clock 
 6. Settings          12. profile  
                      13. sim service
 
                     
 """;
System.out.println(menu);

int home = input.nextInt();
switch (home) { //open braces home



 case 1: System.out.println("phone book"); 
   String phonebook ="""
   1. Search         5. edit
   2. service Nos.   6. Assign tone
   3. Add name       7. Send b'card
   4. Erase          8. options
   9. Speed dial     10. voice tags
 
    """;
   System.out.println(phonebook);

   int insidephonebook = input.nextInt();
   switch (insidephonebook) { //open braces inside phonebook
    case 1: System.out.println("search"); break;
    case 2: System.out.println("service Nos."); break;
    case 3: System.out.println("add name"); break;
    case 4: System.out.println("Erase"); break;
    case 5: System.out.println("edit"); break;
    case 6: System.out.println("Assign tone"); break; 
    case 7: System.out.println("send b'card"); break;
    case 8: System.out.println("option"); 
      String option = """
      1. type of view
      2. memory status
      """;
      System.out.println(option);
    
      int insideoption = input.nextInt();
      switch (insideoption) { //open braces insideoption
       case 1: System.out.println("type of view"); break;
       case 2: System.out.println("memory status"); break;

} //close braces insideoption
       

      break; //break for case1(case8)
    

    case 9: System.out.println("speed dial"); break;
    case 10: System.out.println("voice tags"); break;


} //close braces inside phone book

break; //break for case1
 
  





 case 2: System.out.println("messages");
   String message = """
   1. Write Messages    4. Pictures
   2. inbox             5. Templates
   3. Outbox            6. Smiley
   8. info service      7. Message settings
   9. voice mailbox number  10. service command editor
   """;
   System.out.println(message);
  
   int insidemessage = input.nextInt();
   switch (insidemessage) { //open braces for inside message
    case 1: System.out.println("Write messages"); break;
    case 2: System.out.println("Inbox"); break;
    case 3: System.out.println("Outbox"); break;
    case 4: System.out.println("Pictures"); break;
    case 5: System.out.println("Templates"); break;
    case 6: System.out.println("Smileys"); break;
    case 7: System.out.println("Message settings");
         String messagesettings = """
         1. Set 1   2. Common
         """;
         System.out.println(messagesettings);
         int insidemessagesettings = input.nextInt();
            switch (insidemessagesettings) { //open braces inside message settings
             case 1: System.out.println("Set 1"); 

               String set = """
               1. Message Centre number  2. Messages sent as
               3. Message validity 
               """;
               System.out.println(set);
               int insideset = input.nextInt();
                switch (insideset) { //open braces insideset
                case 1: System.out.println("message centre number"); break;
                case 2: System.out.println("Messages sent as"); break;
                case 3: System.out.println("Messages Validity"); break;
                   } //close braces insideset
               
              break; //break for case2(case7(cas1))
             case 2: System.out.println("Common");
              
               String common = """
               1. Delivery reports    2. Reply via same centre
               3. Character support 
               """;
              System.out.println(common);
              int insidecommon = input.nextInt();
               switch (insidecommon) { //open braces insidecommon
                case 1: System.out.println("Delivery report"); break;
                case 2: System.out.println("Reply via same centre"); break;
                case 3: System.out.println("Character support"); break;
                 } //close braces insidecommon

              break; //break for case2(case7(case2))
                       

        } //close braces inside message settings
      


    break; //break for case2(case7)



    case 8: System.out.println("info service"); break;
    case 9: System.out.println("voice mail number"); break;
    case 10: System.out.println("service comand editor"); break;  

} //close braces for inside message


 break; //break for case2







case 3: System.out.println("chat"); break; //break for case 3





case 4: System.out.println("call register"); 
 String Callregister = """
 1.missed calls               5.show call durtion
 2.Recieved calls             6.show call costs
 3.Dialed calls               7.call cost settings
 4.Erased recent call list    8.prepaid credit
 """;
 System.out.println(Callregister);
 int insidecallregister = input.nextInt();
 
  switch (insidecallregister) { //open braces for inside caall register
   case 1: System.out.println("Missedcalls"); break;
   case 2: System.out.println("Recieved calls"); break;
   case 3: System.out.println("dialed calls"); break;
   case 4: System.out.println("Erased recent call list"); break;
   case 5: System.out.println("Show call duration"); 
       String showcallduration = """
       1.last call duration        4.Dialled calls duration
       2.All call duration         5.Clear timers
       3.received calls duration
       """;
       System.out.println(showcallduration);
       int insideshowcallduration = input.nextInt(); 
    
        switch (insideshowcallduration) { //open braces insideshowcallduration
         case 1: System.out.println("last call duration"); break;
         case 2: System.out.println("All call duration"); break;
         case 3: System.out.println("Recieved calls duration"); break;
         case 4: System.out.println("Dialled calls duration"); break;
         case 5: System.out.println("clear timers"); break;

        } //close braces insideshowcallduration
   break; //break for case4(case5)


   case 6: System.out.println("show call cost");
        String showcallcost = """
        1.Last call cost
        2.All call cost
        3.clear counters
        """;
        System.out.println(showcallcost);
        int insideshowcallcost = input.nextInt();
        
          switch (insideshowcallcost) { //open braces for insideshowcallcost
            case 1: System.out.println("Last callcost"); break;
            case 2: System.out.println("All call cost"); break;
            case 3: System.out.println("Clear counter"); break;
          
          
          } //close braces for insidesshowcallcost
   break; //break for case4(case6)


   case 7: System.out.println("call cost setting"); 
       String callcostsetting = """
       1.Call cost limit
       2.show costs in
       """;
       System.out.println(callcostsetting);
       int insidecallcostsetting = input.nextInt();

         switch (insidecallcostsetting) { //open braces for insidecallcostsetting
            case 1: System.out.println("Call cost limit"); break;
            case 2: System.out.println("show costs in"); break;
           
         } //close braces for insidecallcostsetting
   break; //break for case4(case7)


   case 8: System.out.println("Prepaid credit"); break;
         


} //close braces for inside call register

break; //break for case4






case 5: System.out.println("tones"); 
      String tones = """
      1.Ringing tone           6.Keyboard tone
      2.Ringing volume         7.Warning and game tones
      3.incoming call alart    8.vibrating alert
      4.composer               9.Screen saver
      5.Message alert tone
      """;
      System.out.println(tones);
      int insidetone = input.nextInt();
      
        switch (insidetone) { //openbraces for insidetone
            case 1: System.out.println("Ringing tone"); break;
            case 2: System.out.println("Ringing tone"); break;
            case 3: System.out.println("incoming call alart"); break;
            case 4: System.out.println("Composer"); break;
            case 5: System.out.println("Message alert"); break;
            case 6: System.out.println("Keyboard tone"); break;
            case 7: System.out.println("Warning and game tone"); break;
            case 8: System.out.println("Vibrating alert"); break;
            case 9: System.out.println("Screen saver"); break;

        } //closebraces for inside tone       
  break; //break for case5





case 6: System.out.println("settings"); 
      String settings = """
      1.Call settings    3.Security settings
      2.phone settings   4.Restore factory settings
      """;
      System.out.println(settings);
      int insidesetting = input.nextInt();
   
        switch (insidesetting) { //open braces insidesettings
            case 1: System.out.println("call settings");
                 String callsettings = """
                 1.Automatic redial     4.Own number sending
                 2.speed diallling      5.Phone line in use
                 3.Call waiting option  6. Automatic answer
                 """;
                 System.out.println(callsettings);
                 int insidecallsetting = input.nextInt();
            
                    switch (insidecallsetting) {//open braces for insidecallsetting
                       case 1: System.out.println("Automatic redial"); break;
                       case 2: System.out.println("speed dialling"); break;
                       case 3: System.out.println("Call waiting option"); break;
                       case 4: System.out.println("Own number sending"); break;
                       case 5: System.out.println("phoneline in use"); break;
                       case 6: System.out.println("Automatic answer"); break;


                    } //close braces for in sidecallsettind
            break; // break for case6(case1)


            case 2: System.out.println("Phone settings"); 
                 String phonesetting = """
                 1.Language             4.Network selection
                 2.cell info display    5.Lights
                 3.Welcome note         6.Confirm sim service actions
                 """;
                 System.out.println(phonesetting);
                 int insidephonesetting = input.nextInt();
                  
                    switch (insidephonesetting) { //open braces insidephonesettings
                       case 1: System.out.println("Language"); break;
                       case 2: System.out.println("Cell info display"); break;
                       case 3: System.out.println("Welcome"); break;
                       case 4: System.out.println("Network selection"); break;
                       case 5: System.out.println("Light"); break;
                       case 6: System.out.println("Confirm sim service action"); break;


                    } //close braces for insidephonesettings
            break; //break for case6(case2)     
                 



            case 3: System.out.println("Security settings"); 
                 String securitysetting = """
                 1.PIN code request       4.Closed user group
                 2.Call barring service   5.Phone security
                 3.Fixed dialing          6.Change access code
                 """;
                 System.out.println(securitysetting);
                 int insidesecuritysetting = input.nextInt();
                     
                     switch (insidesecuritysetting) { //open braces insidesecuritysetting
                          case 1: System.out.println("PIN code request"); break;
                          case 2: System.out.println("Call barring service"); break;
                          case 3: System.out.println("Fixed dialing"); break;
                          case 4: System.out.println("Closed user group"); break;
                          case 5: System.out.println("Phone security"); break;
                          case 6: System.out.println("change access code"); break;


                     } //close braces insidesecuritysetting  
            break; //break for case6(3)  


            case 4: System.out.println("Restore factory settings"); break;
 
        } //close braces insidesetting
   break; //brak for case6






case 7: System.out.println("call divert"); break;

case 8: System.out.println("games"); break;

case 9: System.out.println("calculator"); break;

case 10: System.out.println("reminders"); break;

case 11: System.out.println("clock"); 
   String Clock = """
   1.Alarm Clock        4.Stopwatch
   2.Clock setting      5.Countdown timer
   3.Date setting       6.Auto update of date and time
   """;
   System.out.println(Clock);
   int insideclock = input.nextInt(); 
  
     switch (insideclock) { //open braces insideclock
          case 1: System.out.println("Alarm clock"); break;
          case 2: System.out.println("Clock setting"); break;
          case 3: System.out.println("Date setting"); break;
          case 4: System.out.println("Stopwatch"); break;
          case 5: System.out.println("Countdown timer"); break;
          case 6: System.out.println("Auto update of date and time"); break;

     } //close braces insideclock
break; //break case11    





case 12: System.out.println("profile"); break;

case 13: System.out.println("sim service"); break;





 
    } //close brace home


  }
}