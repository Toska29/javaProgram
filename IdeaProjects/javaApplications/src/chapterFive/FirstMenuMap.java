package chapterFive;

public class FirstMenuMap {


    public static void menu(){
        String prompt = """ 
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                
                """;
        System.out.println(prompt);

    }
    public static void phoneBook(){
      String phoneBook = """
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                """;
        System.out.println(phoneBook);

    }

    public static void phonebookOption(int userOption){
        if (userOption == 8){
            System.out.println("1. Type of view \n2. Memory status");
        }
        else{
            if(!(userOption >= 1 && userOption<=2) ){
                phoneBook();
            }
        }

    }

    public static void  messages(){
        String messages = """
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                """;
        System.out.println(messages);
    }
    public static void set(){
        String set = """
                1. Message centre number
                2. Message sent as
                3. Message validity
                """;
        System.out.println(set);
    }
    public static void common(){
        String common = """
                1. Delivery reports
                2. Reply via same centre
                3. Character support
                """;
        System.out.println(common);
    }

    public static void messageSettings(int userOption) {
           String messageSettings = """
                   1. Set
                   2. Common
                   """;
            System.out.println(messageSettings);

    }
    public static void messageSettingsOptions(int userOption){
        switch (userOption){
            case 1:
                set();
                break;
            case 2:
                common();
                break;
        }
    }
    public static void callRegister(){
        String callRegister = """
                1. Missed calls
                2. Received calls
                3. Dialed numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit
                """;
        System.out.println(callRegister);
    }

    public static void showCallDuration(){
        String showCallDuration = """
                        1. Last call duration
                        2. All call's duration
                        3. Received calls' duration
                        4. Dialled calls' duration
                        5. Clear timers
                        """;
        System.out.println(showCallDuration);
    }

    public static void showCallCosts(){
        String showCallCosts = """
                        1. Last call cost
                        2. All calls' cost
                        3. Clear counters
                        """;
        System.out.println(showCallCosts);
    }
    public static void callCostSettings(){
        String callCostSettings = """
                        1. Call cost limit
                        2. Show cost in
                        """;
        System.out.println(callCostSettings);
    }
    public static void callRegisterOptions(int userOption){
        switch(userOption){
            case 5:
                showCallDuration();
                break;
            case 6:
                showCallCosts();
                break;
            case 7:
                callCostSettings();
                break;
        }
    }
    public static void tones(){
        String tones = """
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                """;
        System.out.println(tones);
    }
    public static void settings(){
        String settings = """
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                """;
        System.out.println(settings);
    }
    public static void callSettings(){
        String callSettings = """
                1. Automatic redial
                2. Speed dialing 
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                        """;
        System.out.println(callSettings);
    }
    public static void phoneSettings(){
        String phoneSettings = """
                 1. Language
                 2. Cell info display
                 3. Welcome note
                 4. Network selection
                 5. Lights
                 6. Confirm SIM service actions 
                        """;
        System.out.println(phoneSettings);
    }
    public static void securitySettings(){
        String securitySettings =
                """
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
                        """;
        System.out.println(securitySettings);
    }
    public static void settingsOption(int userOption){
        switch (userOption){
            case 1:
               callSettings();
                break;
            case 2:
                phoneSettings();
                break;
            case 3:
                securitySettings();
                break;
        }
    }
    public static void clock(){
        String clock = """
                1. Alarm clock
                2. Clock settings
                3. Date settings
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                """;
        System.out.println(clock);
    }
}
